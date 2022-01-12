@java.lang.Override
public void onFinish() {
    android.util.Log.d("animation", "onFinishCalled");
    setUpMap(latLng, addressText);
}