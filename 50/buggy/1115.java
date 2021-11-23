public void addListener(utopiaengine.actions.ActionListener l) {
    synchronized(utopiaengine.ActionDispatcher.listeners) {
        java.lang.System.out.println((("Adding " + (l.getClass().getName())) + " as a listener."));
        utopiaengine.ActionDispatcher.listeners.add(l);
    }
}