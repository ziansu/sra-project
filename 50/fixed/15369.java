@java.lang.Override
public void onDesktopEdit() {
    com.benny.openlauncher.core.util.Tool.visibleViews(100, desktopEditOptionView);
    com.benny.openlauncher.core.util.Tool.invisibleViews(100, desktopIndicator);
    updateDock(false);
    updateSearchBar(false);
}