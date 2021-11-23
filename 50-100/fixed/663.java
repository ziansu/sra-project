public void rebuildApplicationData() {
    if (1 == 1) {
        return ;
    }
    boolean must_recover = false;
    eu.focusnet.app.service.DataManager new_dm = new eu.focusnet.app.service.DataManager();
    try {
        new_dm.retrieveApplicationData();
    } catch (eu.focusnet.app.exception.FocusMissingResourceException ex) {
        must_recover = true;
    }
    if (!must_recover) {
        eu.focusnet.app.FocusApplication.getInstance().replaceDataManager(new_dm);
    }
}