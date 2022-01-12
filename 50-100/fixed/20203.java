@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int position, long l) {
    java.lang.String category = ((java.lang.String) (adapterView.getItemAtPosition(position)));
    switch (category) {
        case "Leistungstests" :
            forwardOldExerciseList(R.string.Leistungstests);
            break;
        case "Training" :
            forwardOldExerciseList(R.string.Training);
            break;
        case "Wellness" :
            forwardOldExerciseList(R.string.Wellness);
            break;
        case "Reiner Aufenthalt" :
            forwardOldExerciseList(R.string.ReinerAufenthalt);
            break;
        default :
    }
}