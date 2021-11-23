@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_best_day :
            onBestDaySelected();
            return true;
        default :
            return false;
    }
}