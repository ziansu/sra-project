@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case android.R.id.home :
            onBackPressed();
            break;
        case R.id.action_settings :
            break;
        case R.id.action_synchronize :
            break;
        case R.id.action_update :
            checkApplicationUpdates(true);
            break;
        case R.id.action_send_mail :
            sendMail();
            break;
        case R.id.action_interviewer :
            openInterviewerInfo();
            break;
        case R.id.action_device :
            openDeviceInfo();
            break;
    }
    return super.onOptionsItemSelected(item);
}