@java.lang.Override
public void setController(softwaredesignproject.DistributionNetworkController c) {
    controller = c;
    this.executeButton.setActionCommand(softwaredesignproject.EXECUTE);
    this.executeButton.addActionListener(controller);
}