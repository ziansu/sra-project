@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_save :
            selectSaveSchedule();
            return selectSaveSchedule();
        case R.id.action_delete :
            selectDeleteSchedule();
            return true;
        case R.id.action_cancel :
            android.util.Log.v(sg.edu.nus.iss.phoenix.schedule.android.ui.MaintainScheduleScreen.TAG, "Canceling creating/editing schedule...");
            this.finish();
            return true;
        case R.id.action_copy :
            selectCopySchedule();
    }
    return true;
}