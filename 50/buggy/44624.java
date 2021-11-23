public static boolean optionsItemSelected(com.gcode.notes.activities.compose.list.ComposeListActivity composeListActivity, android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_settings :
            return true;
        case android.R.id.home :
            com.gcode.notes.activities.helpers.compose.list.ComposeListSaveHelper.saveList(composeListActivity);
            composeListActivity.finish();
    }
    return false;
}