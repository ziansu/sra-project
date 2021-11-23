@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (item.getItemId()) {
        case R.id.menu_load_project :
            recordFragment.loadProject();
            break;
        case R.id.menu_new_project :
            recordFragment.newProject();
            break;
        case R.id.menu_save_project :
            recordFragment.saveProject();
            break;
        case R.id.menu_delete_project :
            recordFragment.deleteProject();
            break;
        default :
            break;
    }
    return super.onOptionsItemSelected(item);
}