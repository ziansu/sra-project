@java.lang.Override
protected void internalProcessMessage(java.lang.Object message) {
    travelInfo = new model.TravelInfo();
    util.NodeBehavior.travelInfoBehavior(travelInfo);
    gui.notify(travelInfo, null);
    gui.enable();
}