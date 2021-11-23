@java.lang.Override
public void onDestroyActionMode(android.view.ActionMode mode) {
    mListView.clearChoices();
    deselectAll();
    mSelectedMap.clear();
    mActionMode = null;
}