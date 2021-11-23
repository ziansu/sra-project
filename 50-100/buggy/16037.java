private void loseConnection() {
    android.widget.Toast.makeText(this, "Connection lost, reconnecting...", Toast.LENGTH_SHORT).show();
    java.net.InetAddress address = devices.get(currentSocketName).getInetAddress();
    try {
        devices.get(currentSocketName).close();
    } catch (java.io.IOException e) {
        android.util.Log.w(rienks.wouter.spacebarsimulator.SSClientActivity.TAG, "Failed to close socket after losing connection");
    }
    new rienks.wouter.spacebarsimulator.ReconnectTask(this).execute(address.toString(), currentSocketName);
}