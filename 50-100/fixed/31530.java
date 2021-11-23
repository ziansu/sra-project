@java.lang.Override
public java.awt.Rectangle getBounds() {
    if ((getUser()) == null) {
        return new java.awt.Rectangle();
    }
    net.minecraft.client.gui.FontRenderer fr = getFontRenderer();
    return new java.awt.Rectangle(25, 110, fr.getStringWidth(getUser().username), 8);
}