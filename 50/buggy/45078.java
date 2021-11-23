public synchronized void addMemberToList(long nodeid, java.net.InetSocketAddress addr) {
    this.memberList.put(nodeId, addr);
}