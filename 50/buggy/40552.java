@java.lang.Override
public void setHeight(int value) {
    net.minecraftforge.fml.common.ObfuscationReflectionHelper.setPrivateValue(net.minecraft.client.gui.GuiTextField.class, this, value, "height", "i");
}