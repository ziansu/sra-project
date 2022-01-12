public hu.mta.sztaki.lpds.cloud.simulator.iaas.vmconsolidation.ArithmeticVector subtract(hu.mta.sztaki.lpds.cloud.simulator.iaas.vmconsolidation.ArithmeticVector second) {
    hu.mta.sztaki.lpds.cloud.simulator.iaas.vmconsolidation.ArithmeticVector erg = new hu.mta.sztaki.lpds.cloud.simulator.iaas.vmconsolidation.ArithmeticVector();
    for (int i = 0; i < (erg.size()); i++) {
        if (((this.get(i)) - (second.get(i))) < 0)
            erg.add(0.0);
        else
            erg.add(((this.get(i)) - (second.get(i))));
        
    }
    return erg;
}