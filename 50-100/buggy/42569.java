public android.support.v7.widget.SwitchCompat aSwitch(java.lang.String title, int leftIconId, boolean iconVisible) {
    android.view.View aSwitch = mInflater.inflate(R.layout.fg_switch, mContainer, false);
    background(aSwitch);
    line(aSwitch);
    android.support.v7.widget.SwitchCompat switchField = ((android.support.v7.widget.SwitchCompat) (aSwitch.findViewById(R.id.fg_switch)));
    textView(switchField, title, "", leftIconId, 0, iconVisible);
    mContainer.addView(switchField);
    return switchField;
}