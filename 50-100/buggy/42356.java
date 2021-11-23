@java.lang.Override
public boolean onCreateActionMode(com.nononsenseapps.notepad.ActionMode mode, android.view.Menu menu) {
    android.util.Log.d("MODALCALLBACK", ("onCreateAction del-size: " + (notesToDelete.size())));
    this.textToShare.clear();
    this.notesToDelete.clear();
    android.view.MenuInflater inflater = activity.getMenuInflater();
    if (FragmentLayout.lightTheme)
        inflater.inflate(R.menu.list_select_menu_light, menu);
    else
        inflater.inflate(R.menu.list_select_menu_dark, menu);
    
    mode.setTitle("Select Items");
    return true;
}