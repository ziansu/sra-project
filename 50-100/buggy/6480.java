private void drawHarvestableWine(int x, int y, float color) {
    jsettlers.graphics.sequence.Sequence<? extends jsettlers.graphics.image.Image> seq = this.imageProvider.getSettlerSequence(jsettlers.graphics.map.draw.MapObjectDrawer.OBJECTS_FILE, jsettlers.graphics.map.draw.MapObjectDrawer.WINE);
    int step = jsettlers.graphics.map.draw.MapObjectDrawer.WINE_GROW_STEPS;
    draw(seq.getImageSafe(step), x, y, color);
}