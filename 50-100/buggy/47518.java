public synchronized void addListener(@android.support.annotation.NonNull
final eu.inloop.localmessagemanager.LocalMessageCallback listener) {
    if (!(mListenersUniversal.contains(listener))) {
        mListenersUniversal.add(listener);
    }else {
        if (eu.inloop.localmessagemanager.LocalMessageManager.DEBUG) {
            android.util.Log.w(eu.inloop.localmessagemanager.LocalMessageManager.TAG, ("Listener is already added. " + (listener.toString())));
        }
    }
}