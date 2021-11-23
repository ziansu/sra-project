@java.lang.Override
public void doControl() {
    if (hatchLocationQueue.isNewPacketAvailable()) {
        receivedHatchLocation(hatchLocationQueue.poll());
        us.ihmc.commons.PrintTools.debug(java.lang.String.valueOf(hatchLocationQueue.isNewPacketAvailable()));
    }
}