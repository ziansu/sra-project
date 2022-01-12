@java.lang.Override
protected hydrograph.ui.graph.model.Port clone() throws java.lang.CloneNotSupportedException {
    hydrograph.ui.graph.model.Port clonedPort = ((hydrograph.ui.graph.model.Port) (super.clone()));
    clonedPort.terminal = terminal;
    clonedPort.numberOfPortsOfThisType = numberOfPortsOfThisType;
    clonedPort.portType = portType;
    clonedPort.sequence = sequence;
    clonedPort.labelOfPort = labelOfPort;
    clonedPort.allowMultipleLinks = allowMultipleLinks;
    clonedPort.linkMandatory = linkMandatory;
    return clonedPort;
}