public hu.mta.sztaki.lpds.cloud.simulator.iaas.vmconsolidation.ArithmeticVector subtract(hu.mta.sztaki.lpds.cloud.simulator.iaas.vmconsolidation.ArithmeticVector second) {
    hu.mta.sztaki.lpds.cloud.simulator.iaas.vmconsolidation.ArithmeticVector erg = new hu.mta.sztaki.lpds.cloud.simulator.iaas.vmconsolidation.ArithmeticVector();
    for (int i = 0; i < (this.size()); i++) {
        erg.add(((this.get(i)) - (second.get(i))));
    }
    return erg;
}