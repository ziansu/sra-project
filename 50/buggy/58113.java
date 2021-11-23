private void calculateFDM() {
    net.floodlightcontroller.fdmcalculator.FlowDeviationMethod fdm = new net.floodlightcontroller.fdmcalculator.FlowDeviationMethod(this.currentInstance);
    fdm.runFDM();
}