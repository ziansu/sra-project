protected org.opennms.netmgt.poller.pollables.PollableElement getLockRoot() {
    org.opennms.netmgt.poller.pollables.PollableContainer parent = getParent();
    return parent == null ? this : parent.getLockRoot();
}