@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.add_schedule :
            android.content.Intent addSchedule = new android.content.Intent(this, com.technosales.mobitrack.AddScheduleActivity.class);
            addSchedule.putExtra(com.technosales.mobitrack.ViewScheduleActivity.ARG_DAY, day);
            startActivity(addSchedule);
            return true;
    }
    return super.onOptionsItemSelected(item);
}