@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int position, long l) {
    java.lang.String category = ((java.lang.String) (adapterView.getItemAtPosition(position)));
    switch (category) {
        case "Leistungstests" :
            forwardOldExerciseList(R.string.Leistungstests, exerciseList);
            break;
        case "Training" :
            forwardOldExerciseList(R.string.Training, exerciseList);
            break;
        case "Wellness" :
            forwardOldExerciseList(R.string.Wellness, exerciseList);
            break;
        case "Reiner Aufenthalt" :
            forwardOldExerciseList(R.string.ReinerAufenthalt, exerciseList);
            break;
        default :
    }
}