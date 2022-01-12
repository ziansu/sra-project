@java.lang.Override
public boolean mousePressed(int slotIndex, int x, int y, int mouseEvent, int relativeX, int relativeY) {
    if ((selectedElement) != slotIndex) {
        selectedElement = slotIndex;
        mc.getSoundHandler().playSound(net.minecraft.client.audio.PositionedSoundRecord.createPositionedSoundRecord(new net.minecraft.util.ResourceLocation("gui.button.press"), 1.0F));
        return true;
    }
    return false;
}