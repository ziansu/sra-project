public void gpsDisconnected() {
    android.util.Log.d("MainActivity", ((this.toString()) + " gps disconnect signal"));
    com.example.jonathan.myapplication.Configuration.setLocationHandler(null);
    if ((com.example.jonathan.myapplication.Configuration.getLockService()) != null)
        com.example.jonathan.myapplication.Configuration.getLockService().onDestroy();
    
    if (!(com.example.jonathan.myapplication.Configuration.getTerminate())) {
        android.widget.Toast.makeText(this, "GPS Location Service has Disconnected.  Please re-login.", Toast.LENGTH_LONG).show();
        android.content.Intent intent = new android.content.Intent(this, com.example.jonathan.myapplication.MainActivity.class);
        startActivity(intent);
    }
}