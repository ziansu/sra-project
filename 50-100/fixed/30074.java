@java.lang.Override
public boolean onCreateActionMode(android.support.v4.view.ActionMode mode, android.support.v4.view.Menu menu) {
    android.view.MenuInflater inflater = activity.getMenuInflater();
    if (FragmentLayout.lightTheme)
        inflater.inflate(R.menu.list_select_menu_light, menu);
    else
        inflater.inflate(R.menu.list_select_menu_dark, menu);
    
    mode.setTitle("Select Items");
    return true;
}