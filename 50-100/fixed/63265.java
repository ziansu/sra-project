private void relayStateChangedInternal(int channel, boolean state, java.util.List<eu.geekhome.asymptote.model.SyncUpdate> updates) {
    eu.geekhome.asymptote.model.RelaySyncUpdate relayUpdate = findRelayUpdate(channel, updates);
    if (relayUpdate == null) {
        updates.add(new eu.geekhome.asymptote.model.RelaySyncUpdate(new eu.geekhome.asymptote.model.RelayValue(channel, state)));
    }else {
        relayUpdate.getValue().setState(state);
    }
}