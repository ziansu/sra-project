@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_compose)) {
        composeTweet();
        return true;
    }
    if (id == (R.id.action_profile)) {
        viewUserProfile();
        return true;
    }
    if (id == (R.id.action_logout)) {
        client.clearAccessToken();
        finish();
    }
    return super.onOptionsItemSelected(item);
}