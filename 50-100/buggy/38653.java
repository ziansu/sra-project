@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.action_create_entry :
            displayAddEntryDialog();
            break;
        case R.id.action_search_entries :
            displaySearchEntryDialog();
            break;
        case R.id.action_close_journal :
            displayCloseJournal();
            break;
        case R.id.action_view_journal :
            displayViewJournalDetails();
            break;
        case R.id.action_delete_journal :
            displayDeleteJournal();
            break;
    }
    return super.onOptionsItemSelected(item);
}