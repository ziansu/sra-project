@java.lang.Override
public int getLength() {
    int queuesLength = 0;
    for (org.openflow.protocol.OFPacketQueue queue : queues) {
        queuesLength += queue.getLength();
    }
    return ((super.getLength()) + (org.openflow.vendor.openflow.OFQueueVendorData.MINIMUM_LENGTH)) + queuesLength;
}