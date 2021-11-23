void callOnLoadFinished(T loader) {
    if ((mCallbacks) != null) {
        java.lang.String lastBecause = null;
        try {
            if (DEBUG)
                com.mobilesolutionworks.android.app.LOGGER.fine(("  onCreated in " + loader));
            
            mCallbacks.onCreated(mId, loader);
        } finally {
        }
    }
}