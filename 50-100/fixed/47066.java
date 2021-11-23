private java.lang.String serializeMetadata(java.util.TreeSet<common.messages.ECSNode> metadata) {
    java.lang.String serial = "";
    for (common.messages.ECSNode node : metadata) {
        java.lang.String serialNode = java.lang.String.format("%s,%s|", node.getPort(), node.getIP());
        serial = serial + serialNode;
    }
    return serial;
}