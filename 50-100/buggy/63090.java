public void sendMessageTo(I targetVertexID, M message) {
    if (graphPartition.hasVertex(targetVertexID)) {
        java.util.List<M> msgList = localMessages.get(targetVertexID);
        if (msgList == null) {
            msgList = new java.util.ArrayList<M>(pt.ulisboa.tecnico.hourglass.slave.computation.BatchHourglassPostman.MESSAGE_LIST_INITIAL_CAPACITY);
            msgList.add(message);
            localMessages.put(targetVertexID, msgList);
        }else {
            msgList.add(message);
        }
    }else {
        messageBox.addRemoteMessage(targetVertexID, message);
    }
}