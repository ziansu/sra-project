@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.widget.Toast.makeText(getApplicationContext(), intent.getStringExtra("success"), Toast.LENGTH_LONG).show();
    if (!(lastActivity.equalsIgnoreCase(intent.getStringExtra("success")))) {
        lastActivity = intent.getStringExtra("success");
        setSongArray(intent.getStringExtra("success").toLowerCase());
    }
}