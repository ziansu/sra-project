private void rgbChangedInernal(eu.geekhome.asymptote.model.RGBValue rgbValue, java.util.List<eu.geekhome.asymptote.model.SyncUpdate> updates) {
    eu.geekhome.asymptote.model.RGBSyncUpdate pwmUpdate = findRGBUpdate(rgbValue, updates);
    if (pwmUpdate == null) {
        updates.add(new eu.geekhome.asymptote.model.RGBSyncUpdate(rgbValue));
    }else {
        pwmUpdate.setValue(rgbValue);
    }
}