private void drawFoldedPages() {
    if ((displayPage) > 1) {
        codechicken.lib.gui.GuiDraw.drawTexturedModalRect(5, 163, 0, 188, 21, 21);
    }
    if (((displayPage) + 2) < (pageIndex.length)) {
        codechicken.lib.gui.GuiDraw.drawTexturedModalRect(230, 160, 21, 188, 21, 21);
    }
}