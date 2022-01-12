@java.lang.Override
public void onTeamSelected(com.supercilex.robotscouter.data.model.Team team, boolean addScout) {
    com.supercilex.robotscouter.data.util.TeamHelper helper = team.getHelper();
    if (com.supercilex.robotscouter.util.ViewUtils.isTabletMode()) {
        getSupportFragmentManager().beginTransaction().replace(R.id.scouts, com.supercilex.robotscouter.ui.teamlist.TabletScoutListFragment.newInstance(helper, addScout)).commit();
    }else {
        com.supercilex.robotscouter.ui.scout.ScoutActivity.start(this, helper, addScout);
    }
    com.supercilex.robotscouter.util.AnalyticsUtils.selectTeam(team.getNumber());
}