protected void setToEntityPosition(net.minecraft.entity.Entity e) {
    cameraPosX = (e.posX) + (((e.posX) - (e.lastTickPosX)) * (mc.timer.elapsedPartialTicks));
    cameraPosY = (e.posY) + (((e.posY) - (e.lastTickPosY)) * (mc.timer.elapsedPartialTicks));
    cameraPosZ = (e.posZ) + (((e.posZ) - (e.lastTickPosZ)) * (mc.timer.elapsedPartialTicks));
}