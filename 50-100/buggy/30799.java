@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            onBackPressed();
            return true;
        case R.id.menu_feedback :
            openChangelog();
            break;
        case R.id.menu_changelog :
            openFeedback();
            break;
        case R.id.menu_privacy_policy :
            openPrivacyPolicy();
            break;
    }
    return super.onOptionsItemSelected(item);
}