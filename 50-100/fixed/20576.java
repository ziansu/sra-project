public com.jaguarlandrover.rvi.Service copy() {
    com.jaguarlandrover.rvi.Service copy = new com.jaguarlandrover.rvi.Service(this.getDomain(), this.getNodeIdentifier(), this.getServiceIdentifier());
    copy.setTimeout(this.getTimeout());
    copy.setParameters(this.getParameters());
    return copy;
}