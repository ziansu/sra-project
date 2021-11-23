@java.lang.Override
protected float getReportedScore() {
    float reportedScore = -1;
    android.widget.RadioGroup radioGroup = ((android.widget.RadioGroup) (findViewById(R.id.nrs_radiogroup)));
    int selectedRadioButton = radioGroup.getCheckedRadioButtonId();
    if (reportedScore != (-1)) {
        reportedScore = java.lang.Float.parseFloat(((android.widget.RadioButton) (findViewById(selectedRadioButton))).getText().toString());
    }
    return reportedScore;
}