@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_favorites :
            textFavorites.setVisibility(View.VISIBLE);
            textSchedules.setVisibility(View.GONE);
            textMusic.setVisibility(View.GONE);
            break;
        case R.id.action_schedules :
            textFavorites.setVisibility(View.GONE);
            textSchedules.setVisibility(View.VISIBLE);
            textMusic.setVisibility(View.GONE);
            break;
        case R.id.action_music :
            textFavorites.setVisibility(View.GONE);
            textSchedules.setVisibility(View.GONE);
            textMusic.setVisibility(View.VISIBLE);
            break;
    }
    return false;
}