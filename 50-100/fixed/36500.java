private boolean createIntentInternal(org.onosproject.net.intent.Intent intent) {
    org.onosproject.net.intent.Intent oldValue = intents.putIfAbsent(intent.id(), intent);
    if (oldValue == null) {
        return true;
    }
    log.warn("Intent ID {} already in store, throwing new update away", intent.id());
    return false;
}