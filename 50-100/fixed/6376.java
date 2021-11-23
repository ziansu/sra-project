public void stopDeliveryForQueue(java.lang.String storageQueue) {
    org.wso2.andes.kernel.MessageFlusher.getInstance().clearUpAllBufferedMessagesForDelivery(storageQueueNameToDestinationMap.get(storageQueue));
    java.util.Set<org.wso2.andes.kernel.slot.Slot> orphanedSlots = subscriptionSlotTracker.remove(storageQueue);
    if (null != orphanedSlots) {
        for (org.wso2.andes.kernel.slot.Slot slot : orphanedSlots) {
            clearAllTrackingWhenSlotOrphaned(slot);
        }
    }
}