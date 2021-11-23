public void markTextAsRead(final int textNo) {
    android.util.Log.d(org.lindev.androkom.KomServer.TAG, ("markTextAsRead:" + textNo));
    readMarker.mark(textNo);
    android.util.Log.d(org.lindev.androkom.KomServer.TAG, ("markTextAsRead done:" + textNo));
}