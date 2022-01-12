@java.lang.Override
public void run() {
    if (false) {
        com.android.bpcontrol.model.User.getInstance().setUUID(TEST_UUID);
        startActivity(new android.content.Intent(this, com.android.bpcontrol.HomeActivity.class));
    }else {
        startActivity(new android.content.Intent(this, com.android.bpcontrol.InitialActivity.class));
    }
    finish();
}