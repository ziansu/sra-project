public void onStopTap(android.view.View v) {
    chron.stop();
    if ((ct) != null)
        ct.cancel();
    
    android.widget.Toast stopped = android.widget.Toast.makeText(getApplicationContext(), "Timer Stopped", Toast.LENGTH_LONG);
    stopped.show();
    android.content.Intent home = new android.content.Intent(this, com.example.root.qtv1.MainActivity.class);
    startActivity(home);
}