@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String buffer = "";
    displaySelectedCourseDetails();
    android.util.Log.d(de.schneider_simon.minigolfscores.MainActivity.TAG, selectedClub);
    buffer = de.schneider_simon.minigolfscores.StatsStringMaker.lastTrainingAtSelectedClub(de.schneider_simon.minigolfscores.MainActivity.roundsDb, selectedClub);
    android.widget.TextView lastTrainingText = ((android.widget.TextView) (findViewById(R.id.text_view_last_training)));
    lastTrainingText.setText((((getString(R.string.last_training)) + "\n") + buffer));
}