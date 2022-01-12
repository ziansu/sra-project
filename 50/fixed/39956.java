@java.lang.Override
public void onStop() {
    super.onStop();
    org.huntingtonrobotics.frcrecyclerushpitscouter.TeamLab.get(getActivity()).saveTeams();
}