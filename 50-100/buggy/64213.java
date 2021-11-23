@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
final android.os.Bundle savedInstanceState) {
    android.app.Activity activity = getActivity();
    team = nfl.getTeam(selectedTeam);
    android.widget.TextView textView = ((android.widget.TextView) (activity.findViewById(R.id.team_name)));
    textView.setText(selectedTeam);
    setUpInputFields(activity);
    setUpButtons(activity);
    android.widget.ProgressBar matchupProgress = ((android.widget.ProgressBar) (activity.findViewById(R.id.matchupProgress)));
    season.nfl.nflseasoncalculatorapp.util.MatchupTableTask matchupTableTask = new season.nfl.nflseasoncalculatorapp.util.MatchupTableTask(activity, matchupProgress);
    matchupTableTask.execute(team);
}