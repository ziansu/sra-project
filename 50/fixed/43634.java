private void updateOthers() {
    requestSender.setSuccessor(predecessor.getIP(), predecessor.getPort(), thisNode);
    requestSender.setPredecessor(successor.getIP(), successor.getPort(), thisNode);
}