private static void refreshScaled(net.minecraft.client.Minecraft mc) {
    if (mc == null)
        throw new java.lang.IllegalArgumentException("Gui utils may only be accessed with valid minecraft");
    
    mhfc.net.common.util.gui.MHFCGuiUtil.s = new net.minecraft.client.gui.ScaledResolution(mc.gameSettings, mc.displayHeight, mc.displayWidth);
}