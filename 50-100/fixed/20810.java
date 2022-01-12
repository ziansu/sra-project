private void drawProgressBar(int numberOfLavaBlocks) {
    this.mc.getTextureManager().bindTexture(com.gigavoid.supermod.cookiecraft.gui.GuiLavaConverter.lavaConverterTexture);
    int progressVisible = ((int) ((numberOfLavaBlocks / ((double) (25))) * (com.gigavoid.supermod.cookiecraft.gui.GuiLavaConverter.PROGRESSBAR_WIDTH)));
    this.drawTexturedModalRect(com.gigavoid.supermod.cookiecraft.gui.GuiLavaConverter.PROGRESSBAR_X, com.gigavoid.supermod.cookiecraft.gui.GuiLavaConverter.PROGRESSBAR_Y, 16, 166, progressVisible, com.gigavoid.supermod.cookiecraft.gui.GuiLavaConverter.PROGRESSBAR_HEIGHT);
}