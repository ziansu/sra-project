@java.lang.Override
public boolean onMenuItemSelected(int featureId, android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.ndAbout :
            startActivity(new android.content.Intent(this, com.jasrsir.tracing.activity.About_Activity.class));
            break;
        case R.id.ndProfile :
            startActivity(new android.content.Intent(this, com.jasrsir.tracing.activity.SignUp_Activity.class));
            break;
        case R.id.ndSettings :
            startActivity(new android.content.Intent(this, com.jasrsir.tracing.activity.SettingsActivity.class));
            break;
        default :
            break;
    }
    return super.onMenuItemSelected(featureId, item);
}