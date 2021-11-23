private void drawProgressBar() {
    this.mc.getTextureManager().bindTexture(com.gigavoid.supermod.cookiecraft.gui.GuiLavaConverter.lavaConverterTexture);
    com.gigavoid.supermod.cookiecraft.block.BlockCookieLavaConverter lavaConverter = ((com.gigavoid.supermod.cookiecraft.block.BlockCookieLavaConverter) (tileEntity.getBlockType()));
    int numberOfLavaBlocks = lavaConverter.nrOfLavaBlocks(tileEntity.getWorld(), tileEntity.getPos());
    int progressVisible = ((int) ((numberOfLavaBlocks / ((double) (25))) * (com.gigavoid.supermod.cookiecraft.gui.GuiLavaConverter.PROGRESSBAR_WIDTH)));
    this.drawTexturedModalRect(com.gigavoid.supermod.cookiecraft.gui.GuiLavaConverter.PROGRESSBAR_X, com.gigavoid.supermod.cookiecraft.gui.GuiLavaConverter.PROGRESSBAR_Y, 16, 166, progressVisible, com.gigavoid.supermod.cookiecraft.gui.GuiLavaConverter.PROGRESSBAR_HEIGHT);
}