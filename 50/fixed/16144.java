@java.lang.Override
public void run() {
    highLightMiddleRow(listView, view, adapter, currentPosInMiddle);
    listView.smoothScrollBy((viewTop - ((mRootLayoutHeight) / 3)), 1000);
}