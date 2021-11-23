@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_settings :
            return true;
        case R.id.action_about :
            startActivity(new android.content.Intent(this, com.project.furnishyourhome.AboutActivity.class));
            return true;
        case R.id.action_search :
            onSearchRequested();
    }
    if (leftDrawerListener.onOptionsItemSelected(item)) {
        return true;
    }
    return super.onOptionsItemSelected(item);
}