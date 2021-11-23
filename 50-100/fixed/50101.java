@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_add_cancel :
            finish();
            return true;
        case R.id.action_add_complete :
            createMood(emotion, situation, trigger);
            return true;
    }
    return super.onOptionsItemSelected(item);
}