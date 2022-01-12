private org.springframework.web.servlet.ModelAndView getPlayersView(de.appsolve.padelcampus.db.model.Event event, java.util.Collection<de.appsolve.padelcampus.db.model.Player> players, java.lang.String title) {
    java.util.Map<de.appsolve.padelcampus.db.model.Participant, java.math.BigDecimal> ranking = rankingUtil.getPlayerRanking(players);
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView("players/players");
    mav.addObject("RankingMap", de.appsolve.padelcampus.utils.SortUtil.sortMap(ranking));
    mav.addObject("title", title);
    mav.addObject("Model", event);
    return mav;
}