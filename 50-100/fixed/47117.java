protected void invoke(final Event e) {
    final java.util.Iterator<java.lang.ref.WeakReference<com.spbsu.commons.func.Action<? super Event>>> it = listeners.iterator();
    while (it.hasNext()) {
        final java.lang.ref.WeakReference<com.spbsu.commons.func.Action<? super Event>> next = it.next();
        final com.spbsu.commons.func.Action<? super Event> action = next.get();
        if (action != null)
            action.invoke(e);
        else {
            listeners.remove(next);
        }
    } 
}