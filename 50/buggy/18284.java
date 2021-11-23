public void setIsTimeDriver(boolean value) {
    org.bushe.swing.event.EventBus.publish("TimeDrivers.Update", this);
    this.isTimeDriver = value;
    if ((haveInitialized) && value) {
        ucar.unidata.idv.ViewManager vm = getViewManager();
        vm.ensureOnlyOneTimeDriver(this);
    }
}