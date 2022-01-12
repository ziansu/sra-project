public void setIsTimeDriver(boolean value) {
    this.isTimeDriver = value;
    org.bushe.swing.event.EventBus.publish("TimeDrivers.Update", this);
    if ((haveInitialized) && value) {
        ucar.unidata.idv.ViewManager vm = getViewManager();
        vm.ensureOnlyOneTimeDriver(this);
    }
}