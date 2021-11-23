@java.lang.Override
protected void update(com.stuin.irs_scout.Data.Measure measure, boolean send) {
    super.update(measure, send);
    com.stuin.irs_scout.Views.CompoundButton radioButton;
    for (int i = 0; i < (choices.length); i++) {
        radioButton = ((com.stuin.irs_scout.Views.CompoundButton) (views.get(i)));
        radioButton.setChecked(choices[i].toLowerCase().equals(measure.capability));
    }
}