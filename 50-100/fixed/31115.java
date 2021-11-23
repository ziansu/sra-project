@java.lang.Override
public void onClick(android.view.View v) {
    buttonDoseValue = ((buttonDoseValue) + 1) % ((MAX_UNITS_PER_DOSE) + 1);
    if (((buttonDoseValue) == 0) || ((buttonDoseValue) == 1)) {
        buttonDoseValue = 1;
        buttonUnit.setText(((buttonDoseValue) + " Unit"));
    }else {
        buttonUnit.setText(((buttonDoseValue) + " Units"));
    }
}