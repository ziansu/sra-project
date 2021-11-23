@java.lang.Override
public void run() {
    for (java.lang.Integer teamId : teamIds) {
        statsBean.updateAllRanksForTeam(teamId);
    }
}