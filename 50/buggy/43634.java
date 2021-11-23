private void updateOthers() {
    requestSender.setPredecessor(predecessor.getIP(), predecessor.getPort(), thisNode);
    requestSender.setSuccessor(successor.getIP(), successor.getPort(), thisNode);
}