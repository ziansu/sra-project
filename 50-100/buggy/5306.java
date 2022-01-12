private void trackMaximum(org.deidentifier.arx.framework.lattice.Node node) {
    if ((node.hasProperty(Node.PROPERTY_ANONYMOUS)) && ((((globalMaximum) == null) || ((node.getInformationLoss().compareTo(globalMaximum.getInformationLoss())) > 0)) || (((node.getInformationLoss().compareTo(globalMaximum.getInformationLoss())) == 0) && ((node.getLevel()) > (globalMaximum.getLevel()))))) {
        globalMaximum = node;
    }
}