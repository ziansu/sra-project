public synchronized void removeListener(@android.support.annotation.NonNull
final eu.inloop.localmessagemanager.LocalMessageCallback listener) {
    synchronized(mListenersUniversal) {
        if (mListenersUniversal.contains(listener)) {
            mListenersUniversal.remove(listener);
        }else {
            if (eu.inloop.localmessagemanager.LocalMessageManager.DEBUG) {
                android.util.Log.w(eu.inloop.localmessagemanager.LocalMessageManager.TAG, ("Trying to remove a listener that is not registered. " + (listener.toString())));
            }
        }
    }
}