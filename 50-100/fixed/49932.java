private void pwmChangedInternal(int channel, int duty, java.util.List<eu.geekhome.asymptote.model.SyncUpdate> updates) {
    eu.geekhome.asymptote.model.PWMSyncUpdate pwmUpdate = findPwmUpdate(channel, updates);
    if (pwmUpdate == null) {
        updates.add(new eu.geekhome.asymptote.model.PWMSyncUpdate(new eu.geekhome.asymptote.model.PWMValue(channel, duty)));
    }else {
        pwmUpdate.getValue().setDuty(duty);
    }
}