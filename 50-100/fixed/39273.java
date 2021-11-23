private static boolean isNodeIdAvailable(java.util.List<java.lang.Short> nodeIdList, short nodeIdTobeChecked) {
    boolean nodeIdAvailable = false;
    for (java.lang.Short nodeId : nodeIdList) {
        if ((nodeId.shortValue()) == nodeIdTobeChecked) {
            nodeIdAvailable = true;
        }
    }
    return nodeIdAvailable;
}