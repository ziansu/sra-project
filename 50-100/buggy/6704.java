@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    boolean status;
    switch (item.getItemId()) {
        case R.id.action_settings :
            startActivity(new android.content.Intent(this, io.github.data4all.activity.SettingsActivity.class));
            status = true;
            break;
        case R.id.action_help :
            status = true;
            break;
        case android.R.id.home :
            onWorkflowFinished(null);
            status = true;
            break;
        default :
            return super.onOptionsItemSelected(item);
    }
    return status;
}