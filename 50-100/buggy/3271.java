private org.wso2.andes.kernel.slot.Slot getUnassignedSlot(java.lang.String queueName) throws org.wso2.andes.kernel.AndesException {
    org.wso2.andes.kernel.slot.Slot slotToBeAssigned = null;
    java.lang.String lockKey = queueName + (org.wso2.andes.kernel.slot.SlotManagerClusterMode.class);
    synchronized(lockKey.intern()) {
        slotToBeAssigned = slotAgent.getUnAssignedSlot(queueName);
        if (org.wso2.andes.kernel.slot.SlotManagerClusterMode.log.isDebugEnabled()) {
            org.wso2.andes.kernel.slot.SlotManagerClusterMode.log.debug(((("Giving a slot from unassigned slots. Slot: " + slotToBeAssigned) + " to queue: ") + queueName));
        }
    }
    return slotToBeAssigned;
}