private org.onosproject.net.intent.IntentEvent createIntentInternal(org.onosproject.net.intent.Intent intent) {
    org.onosproject.net.intent.Intent oldValue = intents.putIfAbsent(intent.id(), intent);
    if (oldValue == null) {
        return org.onosproject.net.intent.IntentEvent.getEvent(org.onosproject.net.intent.IntentState.INSTALL_REQ, intent);
    }
    log.warn("Intent ID {} already in store, throwing new update away", intent.id());
    return null;
}