public void addTab(easy.view.tab.IEasyTabItem tabItem) {
    android.view.View view = tabItem.getView();
    view.setClickable(true);
    view.setFocusableInTouchMode(true);
    easy.view.gesture.EasyGesture.addTapGesture(view, new easy.view.tab.EasyTabHost.SimpleTabSelectListener(mSelectListener, mTabWidget.getChildCount()));
    setupTabView(tabItem);
    mTabWidget.addView(view);
    if ((mCurrentTab) == (-1)) {
        setCurrentTab(0);
    }
    mTabItems.add(tabItem);
}