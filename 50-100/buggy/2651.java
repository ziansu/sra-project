protected void doExecute() {
    if (nodeTemplate != null) {
        if (((nodeTemplate.getMinInstances()) == (-1)) && ((((java.math.BigInteger) (nodeTemplate.getMaxInstances())).intValue()) == (-1))) {
        }else {
            nodeTemplate.setMinInstances(this.minInstancesSpin.getSelection());
        }
    }
}