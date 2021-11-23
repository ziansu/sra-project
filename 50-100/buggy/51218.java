private void sendMessageToActivity(android.location.Location l, java.lang.String msg) {
    android.content.Intent intent = new android.content.Intent("GPSLocationUpdates");
    android.os.Bundle b = new android.os.Bundle();
    b.putParcelable("Location", l);
    intent.putExtra("Location", b);
    intent.setAction(in.apps.maitreya.travelalarm.BackgroundLocationService.MY_ACTION);
    android.widget.Toast.makeText(this, ("Sent " + (l.getLatitude())), Toast.LENGTH_SHORT).show();
    this.sendBroadcast(intent);
}