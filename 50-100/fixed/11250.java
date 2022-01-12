@java.lang.Override
public void doControl() {
    if (cameraData.isNewPacketAvailable()) {
        us.ihmc.humanoidRobotics.communication.packets.sensing.VideoPacket vidPack = cameraData.getLatestPacket();
        if (!(testImage)) {
            try {
                java.io.InputStream in = new java.io.ByteArrayInputStream(vidPack.getData());
                javax.imageio.ImageIO.write(javax.imageio.ImageIO.read(in), "png", new java.io.File("testImage"));
            } catch (java.io.IOException e) {
            }
            testImage = true;
        }
    }else {
    }
}