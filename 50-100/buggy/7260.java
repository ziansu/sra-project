@java.lang.Override
public void placeInPortal(net.minecraft.entity.Entity entity, double motionX, double motionY, double motionZ, float rotation) {
    worldServer.theChunkProviderServer.loadChunk(((int) (x)), ((int) (z)));
    entity.setPosition(x, y, z);
    entity.motionX = motionX;
    entity.motionY = motionY;
    entity.motionZ = motionZ;
}