public void removeListener(rinde.sim.event.Listener l, java.lang.Enum<?> eventType) {
    if (containsListener(l, eventType)) {
        listeners.remove(l, eventType);
    }else {
        throw new java.lang.IllegalArgumentException((((("The listener " + l) + " for the type ") + eventType) + " cannot be removed because it does not exist."));
    }
}