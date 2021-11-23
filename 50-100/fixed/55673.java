@java.lang.Override
public android.app.Fragment getItem(int position) {
    android.app.Fragment f = null;
    if (position == 0) {
        f = new frc3824.rohawkticsscouting2017.Fragments.TeamView.AllMatchDataFragment();
        ((frc3824.rohawkticsscouting2017.Fragments.TeamView.AllMatchDataFragment) (f)).setTeam(mTeamNumber);
    }else {
        f = new frc3824.rohawkticsscouting2017.Fragments.TeamView.IndividualMatchDataFragment();
        ((frc3824.rohawkticsscouting2017.Fragments.TeamView.IndividualMatchDataFragment) (f)).setTeamMatch(mTeamNumber, (position - 1));
    }
    return f;
}