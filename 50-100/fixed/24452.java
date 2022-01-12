@java.lang.Override
protected float getReportedScore() {
    android.widget.RadioGroup radioGroup = ((android.widget.RadioGroup) (findViewById(R.id.nrs_radiogroup)));
    int selectedRadioButton = radioGroup.getCheckedRadioButtonId();
    return java.lang.Float.parseFloat(((android.widget.RadioButton) (findViewById(selectedRadioButton))).getText().toString());
}