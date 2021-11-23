private void election(java.lang.String highestId, java.lang.String[] receivers) {
    for (java.lang.String downstreamNode : this.downstreamNodes) {
        try {
            paxos.Message m = new paxos.Message();
            m.messageType = Constant.messageType.Election;
            m.sender = this.current.getNodeName();
            m.highestId = highestId;
            m.receivers = receivers;
            this.current.sendTCPMessage(nodeMap.get(downstreamNode), m);
            break;
        } catch (java.lang.Exception ex) {
        }
    }
}