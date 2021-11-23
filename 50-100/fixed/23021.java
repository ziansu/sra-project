private void paramChangedInternal(int index, int value, java.util.List<eu.geekhome.asymptote.model.SyncUpdate> updates) {
    eu.geekhome.asymptote.model.ParamSyncUpdate paramSyncUpdate = findParamSyncUpdate(index, updates);
    if (paramSyncUpdate == null) {
        updates.add(new eu.geekhome.asymptote.model.ParamSyncUpdate(new eu.geekhome.asymptote.model.ParamValue(index, value)));
    }else {
        paramSyncUpdate.getValue().setValue(value);
    }
}