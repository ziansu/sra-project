public void addValueOpen() {
    com.magestore.app.lib.model.registershift.OpenSessionValue value = mRegisterShiftService.createOpenSessionValue();
    listValueOpen.add(0, value);
    mOpenSessionListPanel.bindList(listValueOpen);
}