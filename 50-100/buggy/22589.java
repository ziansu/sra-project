private org.wso2.andes.kernel.slot.Slot getOverlappedSlot(java.lang.String nodeId, java.lang.String queueName) throws org.wso2.andes.kernel.AndesException {
    org.wso2.andes.kernel.slot.Slot slotToBeAssigned = null;
    java.lang.String lockKey = queueName + (org.wso2.andes.kernel.slot.SlotManagerClusterMode.class);
    synchronized(lockKey.intern()) {
        slotToBeAssigned = slotAgent.getOverlappedSlot(nodeId, queueName);
    }
    return slotToBeAssigned;
}