@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.settings :
            android.content.Intent settings = new android.content.Intent(this, com.example.alex.qtapandroid.activities.SettingsActivity.class);
            startActivity(settings);
        case R.id.about :
            android.content.Intent about = new android.content.Intent(this, com.example.alex.qtapandroid.activities.AboutActivity.class);
            startActivity(about);
    }
    return false;
}