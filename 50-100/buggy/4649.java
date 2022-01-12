public static NovaNative.mc_render_command makeRenderCommand(net.minecraft.client.Minecraft mc, float partialTicks) {
    NovaNative.mc_render_command command = new NovaNative.mc_render_command();
    command.anaglyph = mc.gameSettings.anaglyph;
    command.display_height = mc.displayHeight;
    command.display_width = mc.displayWidth;
    command.render_world = (mc.theWorld) != null;
    if (command.render_world) {
        com.continuum.nova.utils.RenderCommandBuilder.addRenderWorldCommand(mc, partialTicks, command);
    }
    if ((mc.currentScreen) != null) {
        com.continuum.nova.utils.RenderCommandBuilder.addRenderGuiCommand(mc, partialTicks, command);
    }
    return command;
}