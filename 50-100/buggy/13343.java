@java.lang.Override
protected void onResume() {
    super.onResume();
    this.loadImageView();
    this.setupRadioButtons();
    android.widget.RadioGroup radioGroup = ((android.widget.RadioGroup) (this.findViewById(R.id.image_view_radio_group)));
    android.widget.RadioButton cubicBtn = ((android.widget.RadioButton) (radioGroup.findViewById(R.id.interpolate_radio_btn)));
    cubicBtn.setChecked(true);
    neildg.com.eagleeyesr.ui.progress_dialog.ProgressDialogHandler.getInstance().setProgressImplementor(this.imageProgressScreen);
    this.imageProgressScreen.show();
    neildg.com.eagleeyesr.platformtools.notifications.NotificationCenter.getInstance().addObserver(Notifications.ON_SR_PROCESS_COMPLETED, this);
}