@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.workout_page)) {
        startActivity(new android.content.Intent(this, com.vijithandroid.homefit.WorkoutActivity.class));
        return true;
    }
    if (id == (R.id.action_settings)) {
        startActivity(new android.content.Intent(this, com.vijithandroid.homefit.SettingsActivity.class));
        return true;
    }
    return super.onOptionsItemSelected(item);
}