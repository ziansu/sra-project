public hu.mta.sztaki.lpds.cloud.simulator.iaas.vmconsolidation.ArithmeticVector multiply(double constant) {
    hu.mta.sztaki.lpds.cloud.simulator.iaas.vmconsolidation.ArithmeticVector erg = new hu.mta.sztaki.lpds.cloud.simulator.iaas.vmconsolidation.ArithmeticVector();
    for (int i = 0; i < (erg.size()); i++) {
        erg.add(((this.get(i)) * constant));
    }
    return erg;
}