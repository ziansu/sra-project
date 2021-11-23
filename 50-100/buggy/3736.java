private void checkEvents() {
    if (currentTime.equals(nextStartEventTime)) {
        timer.Event currentEvent = futureEvents.first();
        futureEvents.remove(currentEvent);
        pastEvents.add(currentEvent);
        new java.lang.Thread(currentEvent).start();
        nextStartEventTime = futureEvents.first().getEventStartTime();
        checkEvents();
    }
}