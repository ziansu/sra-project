@java.lang.Override
public int getHeight() {
    return net.minecraftforge.fml.common.ObfuscationReflectionHelper.getPrivateValue(net.minecraft.client.gui.GuiTextField.class, this, "height", "i");
}