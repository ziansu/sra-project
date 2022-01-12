@java.lang.Override
public boolean onLongClick(android.view.View v) {
    mMainActivity.selectedId = columnId.get(((int) (v.getTag()))).get(1);
    mMainActivity.selectedNotePosition = ((int) (v.getTag()));
    mMainActivity.noteFocused(2, v);
    return false;
}