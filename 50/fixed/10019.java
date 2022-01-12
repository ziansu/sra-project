@java.lang.Override
public void run() {
    highLightMiddleRow(listview, view, adapter, currentPosInMiddle);
    listView.smoothScrollBy((viewBottom - (((mRootLayoutHeight) / 3) + viewHeight)), 1000);
}