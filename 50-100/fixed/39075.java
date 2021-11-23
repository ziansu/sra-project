@java.lang.Override
protected void doExecute() {
    if (nodeTemplate != null) {
        if ((this.maxInstancesSpin.getSelection()) != (((java.math.BigInteger) (nodeTemplate.getMaxInstances())).intValue())) {
            nodeTemplate.setMaxInstances(java.math.BigInteger.valueOf(this.maxInstancesSpin.getSelection()));
        }
    }
}