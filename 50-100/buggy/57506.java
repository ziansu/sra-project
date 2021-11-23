public void show() throws org.rapla.framework.RaplaException {
    boolean notify = preferences.getEntryAsBoolean(NotificationPlugin.NOTIFY_IF_OWNER_CONFIG, false);
    notifyIfOwnerCheckBox.setEnabled(false);
    notifyIfOwnerCheckBox.setSelected(notify);
    notifyIfOwnerCheckBox.setEnabled(true);
    org.rapla.entities.configuration.RaplaMap<org.rapla.entities.domain.Allocatable> raplaEntityList = preferences.getEntry(NotificationPlugin.ALLOCATIONLISTENERS_CONFIG);
    if (raplaEntityList != null) {
        selection.setAllocatables(raplaEntityList.values());
    }
}