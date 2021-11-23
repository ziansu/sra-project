public Messages.Message getLastMessage(java.lang.String node) {
    return NodeMessageHistoryMap.get(node).get(((NodeMessageHistoryMap.size()) - 1));
}