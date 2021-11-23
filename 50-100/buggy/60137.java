public java.lang.Long save(de.fred4jupiter.fredbet.web.matches.MatchCommand matchCommand) {
    de.fred4jupiter.fredbet.domain.Match match = matchRepository.findOne(matchCommand.getMatchId());
    if (match == null) {
        match = new de.fred4jupiter.fredbet.domain.Match();
    }
    matchConverter.toMatch(matchCommand, match);
    match = save(match);
    matchCommand.setMatchId(match.getId());
    return match.getId();
}