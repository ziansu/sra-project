@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if (serviceBound) {
        unbindService(serviceConnection);
    }
    disposable.dispose();
    disposable1.dispose();
}