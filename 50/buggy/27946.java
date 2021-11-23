@java.lang.Override
public void onCheckedChanged(com.stuin.irs_scout.Views.CompoundButton radioButton, boolean b) {
    if (b) {
        measure.capability = radioButton.getText().toString();
        update(measure, true);
    }
}