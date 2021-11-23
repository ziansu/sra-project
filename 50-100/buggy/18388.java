@java.lang.Override
protected void onPostExecute(java.lang.Boolean isSuccess) {
    isRefreshing = false;
    if (isSuccess) {
        for (int i = 0; i < (daysPager.getAdapter().getCount()); ++i) {
            amai.org.conventions.events.activities.ProgrammeDayFragment fragment = getDayFragment(i);
            fragment.setRefreshing(false);
            fragment.updateEvents();
        }
    }else {
        android.widget.Toast.makeText(this, R.string.update_refresh_failed, Toast.LENGTH_SHORT).show();
    }
}