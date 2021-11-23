@java.lang.Override
protected void onPause() {
    if (isBound) {
        try {
            isBound = false;
            getApplicationContext().unbindService(this);
        } catch (java.lang.IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
    super.onPause();
}