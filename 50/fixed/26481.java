public java.lang.Float getTotal_requirement() {
    total_requirement = 0.0F;
    for (net.floodlightcontroller.fdmcalculator.CustomizedLink cl : this.allLinks) {
        total_requirement += cl.getrequirement();
    }
    return total_requirement;
}