private void transmitKeyFrame(com.DorsetEggs.indi.communicatorService.KeyframePacket keyframePacket) {
    if ((mOutputStream) != null) {
        try {
            byte[] byteArray = com.DorsetEggs.indi.communicatorService.toByteArray(keyframePacket);
            mOutputStream.write(byteArray);
            (replysExpected)++;
        } catch (java.io.IOException e) {
            globals.sendErrorMessage("write failed", e);
        }
    }
}