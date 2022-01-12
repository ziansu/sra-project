protected void setToEntityPosition(net.minecraft.entity.Entity e) {
    cameraPosX = (e.lastTickPosX) - (((e.lastTickPosX) - (e.posX)) * (mc.timer.elapsedPartialTicks));
    cameraPosY = (e.lastTickPosY) - (((e.lastTickPosY) - (e.posY)) * (mc.timer.elapsedPartialTicks));
    cameraPosZ = (e.lastTickPosZ) - (((e.lastTickPosZ) - (e.posZ)) * (mc.timer.elapsedPartialTicks));
}