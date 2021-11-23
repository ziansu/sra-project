public boolean equals(org.opendaylight.controller.sal.flowprogrammer.Flow flow) {
    if (flow == null) {
        return false;
    }
    if (match.equals(flow.getMatch()))
        return false;
    
    if ((priority) != (flow.getPriority()))
        return false;
    
    return true;
}