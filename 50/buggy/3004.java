private boolean isAllowedChild(byte[] nodeID) {
    for (java.lang.String s : allowedChildrenList) {
        if (scanResponseData.equals(java.lang.String.format("%02X", nodeID[0]))) {
            return true;
        }
    }
    return false;
}