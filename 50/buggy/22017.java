public void startConfigFragment() {
    android.app.FragmentManager fm = getFragmentManager();
    com.example.filip.gpsrecorder.ConfigFragment config = new com.example.filip.gpsrecorder.ConfigFragment();
    config.show(fm, "dialog");
}