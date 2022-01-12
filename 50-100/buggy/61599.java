public void resized() {
    run.Game.tileSize = ((int) (((int) (run.Game.frameArea)) / ((run.Game.frameArea) / (run.Game.tileSizePixel))));
    run.Game.tileSizeVector = new objects.utility.Vector((((int) (run.Game.frameArea)) / ((run.Game.frameArea) / (run.Game.tileSizePixel))), (((int) (run.Game.frameArea)) / ((run.Game.frameArea) / (run.Game.tileSizePixel))));
    player.resized();
    hotbar.resized();
}