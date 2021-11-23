public void onSurfaceChanged(int w, int h) {
    synchronized(lock) {
        com.giderosmobile.android.player.GiderosApplication.nativeSurfaceChanged(w, h, com.giderosmobile.android.player.GiderosApplication.getRotation(w, h));
    }
}