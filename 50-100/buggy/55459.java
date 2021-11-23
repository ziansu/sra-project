@java.lang.Override
public void onClick(android.view.View view) {
    android.support.design.widget.Snackbar.make(view, "Removed last set", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    _db.deleteExerciseSet(_adapter.getExerciseSets().get(((_adapter.getExerciseSets().size()) - 1)));
    _adapter.removeLastExerciseSet();
    _adapter.notifyDataSetChanged();
}