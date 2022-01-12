private eu.geekhome.asymptote.model.PWMImpulseSyncUpdate findPwmImpulseUpdate(int channel, java.util.List<eu.geekhome.asymptote.model.SyncUpdate> updates) {
    if ((updates.size()) > 0) {
        for (eu.geekhome.asymptote.model.SyncUpdate syncUpdate : updates) {
            if (syncUpdate instanceof eu.geekhome.asymptote.model.PWMImpulseSyncUpdate) {
                eu.geekhome.asymptote.model.ImpulseValue impulseValue = ((eu.geekhome.asymptote.model.PWMImpulseSyncUpdate) (syncUpdate)).getValue();
                if ((impulseValue.getChannel()) == channel) {
                    return ((eu.geekhome.asymptote.model.PWMImpulseSyncUpdate) (syncUpdate));
                }
            }
        }
    }
    return null;
}