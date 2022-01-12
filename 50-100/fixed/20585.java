public synchronized void update() {
    java.util.ArrayList<nl.tudelft.pixelperfect.event.Event> discardPile = new java.util.ArrayList<nl.tudelft.pixelperfect.event.Event>();
    for (nl.tudelft.pixelperfect.event.Event event : events) {
        long now = java.lang.System.currentTimeMillis();
        if (event.isExpired(now)) {
            discardPile.add(event);
        }
    }
    for (nl.tudelft.pixelperfect.event.Event event : discardPile) {
        event.applyDamage(spaceship);
        discard(event);
    }
}