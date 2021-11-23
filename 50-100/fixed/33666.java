@com.google.common.eventbus.Subscribe
public void onEvent(org.github.sipuada.events.EstablishedCallFinished event) {
    if (event.getCallId().equals(callId)) {
        wipeEstablishedCall(callId, eventBusSubscriberId);
        eventBus.unregister(this);
        activePlugins.remove(callId);
        if (sessionPlugin != null) {
            sessionPlugin.performSessionTermination(callId);
        }
        listener.onCallFinished(callId);
    }
}