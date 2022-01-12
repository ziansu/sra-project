@java.lang.Override
public void run() {
    listView.smoothScrollBy((viewBottom - (((mRootLayoutHeight) / 3) + viewHeight)), 1000);
    highLightMiddleRow(listview, view, adapter, currentPosInMiddle);
}