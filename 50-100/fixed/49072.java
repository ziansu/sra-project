public java.lang.Double getCycleOpponentAverageQuality(pt.belele.project.controllers.util.ResultCycle cycle) {
    double sum = 0;
    for (pt.belele.project.data.Team t : cycle.getTeams()) {
        pt.belele.project.controllers.TeamController tc = new pt.belele.project.controllers.TeamController(t);
        sum += tc.getTeamQuality(cycle.getSeason(), ((cycle.getMatchday()) - 1));
    }
    return sum / (cycle.getTeams().size());
}