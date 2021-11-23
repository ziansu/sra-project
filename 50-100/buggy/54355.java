public synchronized void addListener(int id, @android.support.annotation.NonNull
final eu.inloop.localmessagemanager.LocalMessageCallback listener) {
    java.util.List<eu.inloop.localmessagemanager.LocalMessageCallback> whatListofListeners = mListenersSpecific.get(id);
    if (whatListofListeners == null) {
        whatListofListeners = new java.util.ArrayList<>();
        mListenersSpecific.put(id, whatListofListeners);
    }
    if (!(whatListofListeners.contains(listener))) {
        whatListofListeners.add(listener);
    }
}