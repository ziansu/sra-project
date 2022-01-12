public void notifySelectionChanged(course.examples.cst2335groupproject.adam.LocationItem item) {
    mListView.clearChoices();
    for (int i = 0; i < (mAdapter.getCount()); i++) {
        if (mAdapter.getItem(i).equals(item)) {
            mListView.getChildAt(i).setSelected(true);
        }else {
            mListView.getChildAt(i).setSelected(false);
        }
    }
}