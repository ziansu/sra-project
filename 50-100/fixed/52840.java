@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.mniAnalytics :
            android.content.Intent intentAnalytics = new android.content.Intent(this, com.andrejjj.pocketsecretary.activities.Analytics.class);
            startActivity(intentAnalytics);
            return true;
        case R.id.mniAbout :
            android.widget.Toast.makeText(this, R.string.about_toast, Toast.LENGTH_LONG).show();
            return true;
    }
    return super.onOptionsItemSelected(item);
}