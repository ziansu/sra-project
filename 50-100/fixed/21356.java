@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        return true;
    }
    if (id == (R.id.action_refresh)) {
        android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.grishman.rssfeed.service.FeedParserService.class);
        startService(intent);
    }
    if (id == (R.id.action_delete)) {
        fakeData();
    }
    return super.onOptionsItemSelected(item);
}