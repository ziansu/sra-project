@java.lang.Override
public void Ui_init(android.view.View v) {
    super.Ui_init(v);
    temp.setOnSeekBarChangeListener(new org.unhack.chemistryeasy.ui.listeners.TempSeekBarListener(temp));
    temp.setProgress(org.unhack.chemistryeasy.ui.fragments.NORMAL_TEMPERATURE_K);
    this.container.getStateInTemp(org.unhack.chemistryeasy.ui.fragments.NORMAL_TEMPERATURE_K);
    temp.setVisibility(View.VISIBLE);
    temp_tx.setVisibility(View.VISIBLE);
    temp_tx.setText(((java.lang.String.valueOf(org.unhack.chemistryeasy.ui.fragments.NORMAL_TEMPERATURE_K)) + (getString(R.string.Kelvin))));
}