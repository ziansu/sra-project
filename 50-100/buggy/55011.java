@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_direction)) {
        if (item.isChecked()) {
            com.NathanOdong.londonbushunter.fragments.LineStopPointFragment.isInbound = false;
            item.setChecked(com.NathanOdong.londonbushunter.fragments.LineStopPointFragment.isInbound);
            runLoadResultsTask();
        }else {
            com.NathanOdong.londonbushunter.fragments.LineStopPointFragment.isInbound = true;
            item.setChecked(com.NathanOdong.londonbushunter.fragments.LineStopPointFragment.isInbound);
            runLoadResultsTask();
        }
        return false;
    }
    return super.onOptionsItemSelected(item);
}