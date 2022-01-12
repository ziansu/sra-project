@java.lang.Override
public void call(boolean res) {
    if (res) {
        android.widget.Toast.makeText(this, "Authenticated!", Toast.LENGTH_SHORT).show();
        act.finish();
        android.content.Intent intent = new android.content.Intent(this, com.mysjsu.mobsecurity.MonitoringActivity.class);
        startActivity(intent);
    }else {
        android.widget.Toast.makeText(this, "Incorrect Password", Toast.LENGTH_SHORT).show();
        act.finish();
        act.onBackPressed();
    }
}