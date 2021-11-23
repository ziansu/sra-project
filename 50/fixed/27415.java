public boolean onTickInGUI(float clock, net.minecraft.client.Minecraft minecraft, vl guiScreen) {
    if (guiScreen != null) {
        instance.onTickInGUI(guiScreen);
    }
    return true;
}