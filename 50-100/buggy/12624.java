private boolean isReachable(int eventFrom, int eventTo) {
    java.lang.System.out.println(eventFrom);
    java.util.Set<java.lang.Integer> outgoingEvents = messages.get(eventFrom);
    if (outgoingEvents == null) {
        return false;
    }
    for (java.lang.Integer intermediateEvent : outgoingEvents) {
        if (intermediateEvent.equals(eventTo)) {
            return true;
        }
        if (isReachable(intermediateEvent, eventTo)) {
            return true;
        }
    }
    return false;
}