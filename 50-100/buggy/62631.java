public com.jaguarlandrover.rvi.Service copy() {
    com.jaguarlandrover.rvi.Service copy = new com.jaguarlandrover.rvi.Service(this.getServiceIdentifier(), this.getDomain(), this.getBundleIdentifier(), this.getNodeIdentifier());
    copy.setTimeout(this.getTimeout());
    copy.setParameters(this.getParameters());
    return null;
}