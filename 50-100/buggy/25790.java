@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.action_refresh :
            new com.markzhai.lyrichere.workers.Finder(this).execute(android.os.Environment.getExternalStorageDirectory());
            break;
        case R.id.action_about :
            startActivity(new android.content.Intent(this, com.markzhai.lyrichere.ui.AboutActivity.class));
            break;
        case R.id.action_settings :
            startActivity(new android.content.Intent(this, com.markzhai.lyrichere.prefs.SettingsActivity.class));
            break;
        default :
            return false;
    }
    return true;
}