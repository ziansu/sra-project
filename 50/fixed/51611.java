@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onMessageEvent(org.unhack.chemistryeasy.events.TemperatureSlideEvent event) {
    container.getStateInTemp(event.temperature);
    temp_tx.setText(((java.lang.String.valueOf(event.temperature)) + (getString(R.string.Kelvin))));
}