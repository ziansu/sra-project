public synchronized boolean removeEvent(timer.Event event) {
    if (!(isRunning())) {
        if (pastEvents.contains(event)) {
            pastEvents.remove(event);
            return true;
        }
        if (futureEvents.contains(event)) {
            futureEvents.remove(event);
            nextStartEventTime = (futureEvents.isEmpty()) ? futureEvents.first().getEventStartTime() : new timer.Time();
        }
    }
    return false;
}