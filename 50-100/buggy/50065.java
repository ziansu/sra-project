@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        return true;
    }else
        if (id == (R.id.createRefereeSaveButton)) {
            saveChangesAndQuit();
        }else
            if (id == (R.id.createRefereeDeleteButton)) {
            }
        
    
    return super.onOptionsItemSelected(item);
}