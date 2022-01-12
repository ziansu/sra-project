@java.lang.Override
public void refreshUI() {
    mHolder.setPrefWidth(sizeCalculator.getMainViewPanelWidth());
    mHolder.setPrefHeight(sizeCalculator.getWindowHeight());
    allSongsViewController.refreshUI();
    albumsViewController.refreshUI();
}