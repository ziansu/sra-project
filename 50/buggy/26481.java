public java.lang.Float getTotal_requirement() {
    for (net.floodlightcontroller.fdmcalculator.CustomizedLink cl : this.allLinks) {
        total_requirement += cl.getrequirement();
    }
    return total_requirement;
}