@java.lang.Override
public void placeInPortal(net.minecraft.entity.Entity entity, float rotation) {
    worldServer.theChunkProviderServer.loadChunk(((int) (x)), ((int) (z)));
    entity.setPosition(x, y, z);
    entity.motionX = entity.motionY = entity.motionZ = 0;
}