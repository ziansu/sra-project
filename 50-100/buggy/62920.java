@java.lang.Override
public void onDestroyActionMode(com.nononsenseapps.notepad.ActionMode mode) {
    android.util.Log.d("modeCallback", ((("onDestroyActionMode: " + (mode.toString())) + ", ") + (mode.getMenu().toString())));
    list.setFutureSingleCheck();
    this.textToShare.clear();
    this.notesToDelete.clear();
}