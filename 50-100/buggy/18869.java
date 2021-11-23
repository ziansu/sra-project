public synchronized net.floodlightcontroller.nfvtest.nfvcorestructure.NFVNode removeFromBqRear(int stageIndex) {
    net.floodlightcontroller.nfvtest.nfvcorestructure.NFVNode node = bufferNodeQueues.get(stageIndex).pollLast();
    if (node != null)
        logger.info((("node: " + (node.vmInstance.managementIp)) + " is removed from buffer queue rear."));
    
    node.setScalingInterval((-1));
    return node;
}