@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    unregisterReceiver(this);
    try {
        if (intent.getAction().equals(FileBrowser.ACTION_DIRECTORY_SELECTED))
            location.setText(intent.getStringExtra("folder"));
        
    } catch (java.lang.Exception e) {
        android.widget.Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();
    }
}