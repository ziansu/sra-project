private static void handleMouseScroll() {
    org.lwjgl.input.Mouse.poll();
    int i = org.lwjgl.input.Mouse.getDWheel();
    if (i != 0) {
        net.unaussprechlich.managedgui.lib.GuiManagerMG.onScroll(i);
        com.palechip.hudpixelmod.extended.HudPixelExtendedEventHandler.handleMouseScroll(i);
    }
}