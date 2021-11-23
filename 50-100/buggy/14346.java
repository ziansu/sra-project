private void appendTab(java.lang.String name) {
    actionBar.addTab(actionBar.newTab().setText(name).setTabListener(tabListener), ((actionBar.getTabCount()) - 1), true);
    viewPager.setCurrentItem(((actionBar.getTabCount()) - 1));
    adapter.update();
}