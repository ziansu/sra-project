public void addListener(utopiaengine.actions.ActionListener l) {
    synchronized(utopiaengine.ActionDispatcher.listeners) {
        utopiaengine.ActionDispatcher.listeners.add(l);
    }
}