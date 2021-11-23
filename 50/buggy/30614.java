@java.lang.Override
public void onFinishDesktopEdit() {
    com.benny.openlauncher.core.util.Tool.visibleViews(100, desktopIndicator);
    com.benny.openlauncher.core.util.Tool.invisibleViews(100, desktopEditOptionView);
    updateDock(true);
    updateSearchBar(true);
    dragOptionView.setAutoHideView(searchBar);
}