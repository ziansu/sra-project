@java.lang.Override
public void onClick(android.view.View v) {
    if (((spnExercise.getSelectedItem()) != null) && ((spnObjective.getSelectedItem()) != null)) {
        if (spnType.getSelectedItem().toString().equals(getString(R.string.highest))) {
            generateHighestReport(spnExercise.getSelectedItem().toString(), spnObjective.getSelectedItem().toString());
        }else {
            generateLowestReport();
        }
    }
}