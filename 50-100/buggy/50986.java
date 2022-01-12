@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_create)) {
        com.team980.thunderscout.sheets.task.SheetsCreateTask createTask = new com.team980.thunderscout.sheets.task.SheetsCreateTask(getActivity().getApplicationContext());
        createTask.execute();
    }
    return super.onOptionsItemSelected(item);
}