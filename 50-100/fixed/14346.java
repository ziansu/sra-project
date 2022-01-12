private void appendTab(java.lang.String name) {
    actionBar.addTab(actionBar.newTab().setText(name).setTabListener(tabListener), ((actionBar.getTabCount()) - 1), true);
    adapter.update();
    viewPager.setCurrentItem(((actionBar.getTabCount()) - 1));
}