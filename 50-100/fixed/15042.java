@java.lang.Override
public void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) {
    super.onListItemClick(l, v, position, id);
    android.content.Intent intent = new android.content.Intent(getActivity(), com.hf.workit.activities.CardioSummaryActivity.class);
    intent.putExtra(IExercise.EXERCISE_ID, mExercisesIds.get(((int) (position))));
    startActivity(intent);
}