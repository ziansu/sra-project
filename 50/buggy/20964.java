public void onDestroy() {
    android.util.Log.d(App.TAG, "onDestroy");
    mediaPlayer.stop();
    model.setInvalidState(false);
}