public void addTabs(io.stormcast.app.stormcast.views.tabswitches.SwitchTabSelector.SwitchTab[] switchTabs) {
    this.switchTabs = switchTabs;
    for (int i = 0; i < (switchTabs.length); i++) {
        android.widget.RelativeLayout switchTab = inflateView(i, switchTabs[i].entry.toString());
        this.addView(switchTab);
        switchTab.setOnTouchListener(this);
    }
    setState(mSelectedIndex, true);
}