private void stateChangedInternal(java.lang.String state, java.util.ArrayList<eu.geekhome.asymptote.model.SyncUpdate> updates) {
    eu.geekhome.asymptote.model.StateSyncUpdate stateUpdate = findStateUpdate(updates);
    if (stateUpdate == null) {
        updates.add(new eu.geekhome.asymptote.model.StateSyncUpdate(state));
    }else {
        stateUpdate.setValue(state);
    }
}