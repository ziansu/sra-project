@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int whichButton) {
    android.text.Editable workoutNavn = editText.getText();
    traeningsPlanData.addWorkout(new com.example.martindalby.gruppeawesome.DataFiles.WorkoutData(traeningsPlanData.getWorkouts().size(), workoutNavn.toString(), new java.util.ArrayList<com.example.martindalby.gruppeawesome.DataFiles.OvelseData>(), null));
    datafiles.pushUser(datafiles.bruger);
}