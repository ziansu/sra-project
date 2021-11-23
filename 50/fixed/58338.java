protected org.jgroups.protocols.Address determineCoordinator() {
    java.util.List<org.jgroups.protocols.Address> tmp = members;
    return !(tmp.isEmpty()) ? tmp.get(0) : null;
}