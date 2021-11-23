@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.action_refresh)) {
        android.widget.Toast.makeText(this, "Refresh called!", Toast.LENGTH_SHORT).show();
        callFetchWeatherTask();
    }else
        if ((item.getItemId()) == (R.id.settings)) {
            startSettingActivity();
            return true;
        }
    
    return super.onOptionsItemSelected(item);
}