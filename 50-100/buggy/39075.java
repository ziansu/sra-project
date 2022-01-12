protected void doExecute() {
    if (((nodeTemplate.getMinInstances()) == (-1)) && ((((java.math.BigInteger) (nodeTemplate.getMaxInstances())).intValue()) == (-1))) {
    }else {
        nodeTemplate.setMaxInstances(java.math.BigInteger.valueOf(this.maxInstancesSpin.getSelection()));
    }
}