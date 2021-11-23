@java.lang.Override
public void onNext(rx.Notification<T> t) {
    isLocked.set(false);
    filteredTerminals.onNext(t);
}