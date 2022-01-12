private void relayImpulseChangedInternal(int channel, long impulse, java.util.List<eu.geekhome.asymptote.model.SyncUpdate> updates) {
    eu.geekhome.asymptote.model.RelayImpulseSyncUpdate relayImpulseUpdate = findRelayImpulseUpdate(channel, updates);
    if (relayImpulseUpdate == null) {
        updates.add(new eu.geekhome.asymptote.model.RelayImpulseSyncUpdate(new eu.geekhome.asymptote.model.ImpulseValue(channel, impulse)));
    }else {
        relayImpulseUpdate.getValue().setImpulse(impulse);
    }
}