private static void onException(java.lang.String context, java.lang.Exception exc) {
    ScreenshotDiary.logger.log(java.util.logging.Level.SEVERE, exc.getMessage());
    net.minecraft.client.Minecraft mc = net.minecraft.client.Minecraft.getMinecraft();
    net.minecraft.util.ChatComponentTranslation cct = new net.minecraft.util.ChatComponentTranslation(context, new java.lang.Object[]{ exc.getMessage() });
    mc.ingameGUI.getChatGUI().printChatMessage(cct);
}