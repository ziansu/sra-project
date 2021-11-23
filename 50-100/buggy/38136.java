public boolean addEvent(carelender.model.Event eventObj) {
    eventObj.setUid((currentUid += 1));
    carelender.model.AppSettings.getInstance().setIntSetting(SettingName.CURRENT_INDEX, currentUid);
    events.add(eventObj);
    updateUndoManager(eventObj, UndoType.ADD);
    return saveToFile("events.dat", events);
}