@java.lang.Override
public void onDestroyActionMode(android.view.ActionMode mode) {
    mode.finish();
    inActionMode = false;
    mGrid.setChoiceMode(GridView.CHOICE_MODE_SINGLE);
}