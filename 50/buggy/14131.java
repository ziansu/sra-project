public void addValueOpen() {
    com.magestore.app.lib.model.registershift.OpenSessionValue value = mRegisterShiftService.createOpenSessionValue();
    listValueOpen.add(value);
    mOpenSessionListPanel.bindList(listValueOpen);
}