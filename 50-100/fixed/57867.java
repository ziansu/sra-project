@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.add_event_toolbar_submit :
            if (createEvent()) {
                android.content.Intent intent = new android.content.Intent();
                setResult(moe.akagi.chibaproject.activity.RESULT_OK, intent);
                moe.akagi.chibaproject.activity.ActivityCollector.removeActivity(this);
            }
            break;
    }
    return super.onOptionsItemSelected(item);
}