private void trackMinimum(org.deidentifier.arx.framework.lattice.Node node) {
    if ((node.hasProperty(Node.PROPERTY_ANONYMOUS)) && (((globalMinimum) == null) || ((node.getInformationLoss().compareTo(globalMinimum.getInformationLoss())) < 0))) {
        globalMinimum = node;
    }
}