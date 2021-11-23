@java.lang.Override
public void onResume() {
    super.onResume();
    mEngine.start(this);
    mEngine.addEngineReadyCallback(mReadyCallback);
    refresh();
}