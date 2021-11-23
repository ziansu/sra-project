org.jgroups.protocols.Address determineCoordinator() {
    return !(members.isEmpty()) ? members.get(0) : null;
}