public synchronized void sendMessageWithValue(int node, int type, int value) {
    network.sendMessage(node, new algo.ftsta.message.Message(this.nodeID, type, this.currSN, value, lc));
    if (((type != (algo.ftsta.message.Message.E_ACCEPT)) && (type != (algo.ftsta.message.Message.E_PROPOSE))) && (type != (algo.ftsta.message.Message.E_REJECT))) {
        lc.inc();
    }
    if (type == (algo.ftsta.message.Message.M_S)) {
        (num_unack_msgs[node])++;
    }
}