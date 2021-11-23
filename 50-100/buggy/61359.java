@java.lang.Override
public boolean onLongClick(android.view.View v) {
    android.util.Log.v(benawad.com.todolist.adapters.CardViewAdapter.TAG, "onLongClick");
    mMainActivity.selectedId = columnId.get(((int) (v.getTag()))).get(0);
    mMainActivity.selectedNotePosition = ((int) (v.getTag()));
    mMainActivity.noteFocused(1);
    return false;
}