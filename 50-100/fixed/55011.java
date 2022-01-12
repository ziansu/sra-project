@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_direction)) {
        if (item.isChecked()) {
            com.NathanOdong.londonbushunter.fragments.LineStopPointFragment.isInbound = false;
            item.setChecked(false);
            runLoadResultsTask();
        }else {
            com.NathanOdong.londonbushunter.fragments.LineStopPointFragment.isInbound = true;
            item.setChecked(true);
            runLoadResultsTask();
        }
        return false;
    }
    return super.onOptionsItemSelected(item);
}