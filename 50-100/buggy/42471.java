@java.lang.Override
public void render(littleMaidMobX.model.caps.IModelCaps entityCaps, float f, float f1, float f2, float pheadYaw, float pheadPitch, float f5, boolean pIsRender) {
    setRotationAngles(f, f1, f2, pheadYaw, pheadPitch, f5, entityCaps);
    mainFrame.render(f5, pIsRender);
    if (((net.minecraft.client.Minecraft.FRAME_NUM) % 100) == 0) {
        java.lang.System.out.println((("evelyn4 " + (this.boxList.size())) + " boxes"));
    }
}