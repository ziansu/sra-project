@java.lang.Override
public void onClick(android.view.View v) {
    if (v.getTag().equals(com.roughike.bottombar.BottomBar.TAG_BOTTOM_BAR_VIEW_INACTIVE)) {
        android.view.View oldTab = findViewWithTag(com.roughike.bottombar.BottomBar.TAG_BOTTOM_BAR_VIEW_ACTIVE);
        unselectTab(oldTab, true);
        selectTab(v, true);
        shiftingMagic(oldTab, v, true);
    }
    updateSelectedTab(findItemPosition(v));
}