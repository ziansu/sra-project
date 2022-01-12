eu.geekhome.asymptote.model.RelaySyncUpdate findRelayUpdate(int channel, java.util.ArrayList<eu.geekhome.asymptote.model.SyncUpdate> updates) {
    if ((updates.size()) > 0) {
        for (eu.geekhome.asymptote.model.SyncUpdate syncUpdate : updates) {
            if (syncUpdate instanceof eu.geekhome.asymptote.model.RelaySyncUpdate) {
                eu.geekhome.asymptote.model.RelayValue relayValue = ((eu.geekhome.asymptote.model.RelaySyncUpdate) (syncUpdate)).getValue();
                if ((relayValue.getChannel()) == channel) {
                    return ((eu.geekhome.asymptote.model.RelaySyncUpdate) (syncUpdate));
                }
            }
        }
    }
    return null;
}