@java.lang.Override
public void onCreate() {
    tts = new android.speech.tts.TextToSpeech(this, this);
    super.onCreate();
    sock = new com.example.stefan.helloworld.SocketHelper(this);
    android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);
    locationManager.requestLocationUpdates("gps", 1000, 10, this);
}