private void checkEvents() {
    if ((currentTime.equals(nextStartEventTime)) && (!(futureEvents.isEmpty()))) {
        timer.Event currentEvent = futureEvents.get(0);
        futureEvents.remove(currentEvent);
        pastEvents.add(currentEvent);
        new java.lang.Thread(currentEvent).start();
        if (!(futureEvents.isEmpty())) {
            nextStartEventTime = futureEvents.get(0).getEventStartTime();
        }
        checkEvents();
    }
}