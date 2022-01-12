@java.lang.Override
public void onValueChange(android.widget.NumberPicker picker, int oldVal, int newVal) {
    com.creativelighting.wificontrolfreak.tabs.ColourControlFragment.colourWheel.setNewCenterColor(android.graphics.Color.rgb(com.creativelighting.wificontrolfreak.tabs.ColourControlFragment.redPicker.getValue(), com.creativelighting.wificontrolfreak.tabs.ColourControlFragment.greenPicker.getValue(), com.creativelighting.wificontrolfreak.tabs.ColourControlFragment.bluePicker.getValue()));
    com.creativelighting.wificontrolfreak.Comms.WHEEL_COLOUR = com.creativelighting.wificontrolfreak.tabs.ColourControlFragment.colourWheel.getColourNoAmber();
    com.creativelighting.wificontrolfreak.Comms.AMBER_COLOUR = android.graphics.Color.red(com.creativelighting.wificontrolfreak.tabs.ColourControlFragment.colourWheel.getAmber());
    com.creativelighting.wificontrolfreak.tabs.ColourControlFragment.sendColourStream(com.creativelighting.wificontrolfreak.tabs.ColourControlFragment.RGB);
}