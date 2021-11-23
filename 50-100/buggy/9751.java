private void dispatch(final com.chalcodes.event.EventReceiver<T> receiver, final T event) {
    try {
        receiver.onEvent(this, event);
    } catch (java.lang.Exception e) {
        mReceivers.remove(receiver);
        if ((mExceptionBus) != null) {
            mExceptionBus.broadcast(e);
        }
    }
}