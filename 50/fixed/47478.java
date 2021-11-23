@java.lang.Override
public void onDestroyActionMode(android.view.ActionMode mode) {
    mListView.clearChoices();
    mSelectedMap.clear();
    mActionMode = null;
}