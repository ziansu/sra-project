@java.lang.Override
public void run() {
    testGroupListAdapter.addItem(0, testGroup);
    if (testGroupCountBefore == 0) {
        refreshDrawerViews();
    }else {
        if ((testGroupListLayout.findFirstCompletelyVisibleItemPosition()) == 0) {
            testGroupListLayout.scrollToPosition(0);
        }
    }
}