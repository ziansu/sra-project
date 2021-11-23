@java.lang.Override
public void doControl() {
    us.ihmc.commons.PrintTools.debug("Got called");
    if (hatchLocationQueue.isNewPacketAvailable()) {
        receivedHatchLocation(hatchLocationQueue.poll());
        us.ihmc.commons.PrintTools.debug(java.lang.String.valueOf(hatchLocationQueue.isNewPacketAvailable()));
    }
}