public void setShareScreenSwitch(boolean isGroupOwner) {
    mShareScreenSwitch.setOnCheckedChangeListener(null);
    mShareScreenSwitch.setChecked(isGroupOwner);
    mShareScreenSwitch.setOnCheckedChangeListener(mShareScreenSwitchListener);
}