@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    resetExerciseListViewColors(parent);
    parent.getChildAt(position).setBackgroundColor(Color.LTGRAY);
    com.example.kaveon14.workoutbuddy.DataBase.Data.Exercise exercise = customExerciseList.get(position);
    setDeleteButton(exercise);
}