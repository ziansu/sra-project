@java.lang.Override
public void onPause() {
    super.onPause();
    com.gcw.sapienza.places.MainActivity.isForeground = false;
    android.util.Log.d(com.gcw.sapienza.places.MainActivity.TAG, "pause");
}