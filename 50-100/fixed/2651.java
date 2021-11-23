@java.lang.Override
protected void doExecute() {
    if (nodeTemplate != null) {
        if ((this.minInstancesSpin.getSelection()) != (nodeTemplate.getMinInstances())) {
            nodeTemplate.setMinInstances(this.minInstancesSpin.getSelection());
        }
    }
}