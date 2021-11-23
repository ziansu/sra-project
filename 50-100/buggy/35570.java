private org.springframework.web.servlet.ModelAndView getPlayerView(de.appsolve.padelcampus.db.model.Player player) {
    if (player == null) {
        throw new de.appsolve.padelcampus.exceptions.ResourceNotFoundException();
    }
    java.util.SortedMap<de.appsolve.padelcampus.db.model.Participant, java.math.BigDecimal> ranking = rankingUtil.getRanking(player.getGender());
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView("players/player", "Player", player);
    mav.addObject("RankingValue", ranking.get(player));
    return mav;
}