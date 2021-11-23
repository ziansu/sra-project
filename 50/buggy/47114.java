@java.lang.Override
public void onClick(android.view.View view) {
    com.adafruit.bluefruit.le.connect.Patient.PatientActivity activity = ((com.adafruit.bluefruit.le.connect.Patient.PatientActivity) (getActivity()));
    activity.transitionToFragment(new com.adafruit.bluefruit.le.connect.Patient.ExerciseResultsFragment());
}