@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        writePreferences();
        readPreferences();
        return true;
    }else
        if (id == (R.id.clear_all)) {
            com.example.heetel.todo.TaskManager.clear();
            initializeAdapter();
        }
    
    return super.onOptionsItemSelected(item);
}