@java.lang.Override
public boolean setMotmPoll(be.spring.app.service.Match match) {
    if (match.getStatus().equals(MatchStatusEnum.PLAYED)) {
        be.spring.app.service.PlayersPoll playersPoll = new be.spring.app.service.PlayersPoll();
        playersPoll.setOptions(getPlayerOptionsFor(match));
        playersPoll.setStartDate(org.joda.time.DateTime.now());
        playersPoll.setEndDate(org.joda.time.DateTime.now().plusDays(3));
        playersPoll.setQuestion("Automatically generated: Who will be man of the match?");
        playersPoll.setStatus(PollStatusEnum.OPEN);
        match.setMotmPoll(playersPoll);
        return true;
    }
    return false;
}