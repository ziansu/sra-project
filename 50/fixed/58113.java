private boolean calculateFDM() {
    net.floodlightcontroller.fdmcalculator.FlowDeviationMethod fdm = new net.floodlightcontroller.fdmcalculator.FlowDeviationMethod(this.currentInstance);
    return fdm.runFDM();
}