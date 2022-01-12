eu.geekhome.asymptote.model.StateSyncUpdate findStateUpdate(java.util.List<eu.geekhome.asymptote.model.SyncUpdate> updates) {
    if ((updates.size()) > 0) {
        for (eu.geekhome.asymptote.model.SyncUpdate syncUpdate : updates) {
            if (syncUpdate instanceof eu.geekhome.asymptote.model.StateSyncUpdate) {
                return ((eu.geekhome.asymptote.model.StateSyncUpdate) (syncUpdate));
            }
        }
    }
    return null;
}