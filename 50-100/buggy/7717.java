@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (android.R.id.home)) {
        android.content.Intent homeIntent = new android.content.Intent(getApplicationContext(), com.anilicious.rigfinances.activities.MainActivity.class);
        homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }else {
        android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.anilicious.rigfinances.activities.SettingsActivity.class);
        startActivity(intent);
    }
    return super.onOptionsItemSelected(item);
}