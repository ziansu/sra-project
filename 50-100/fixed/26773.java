public void resized() {
    run.Game.tileSize = ((int) ((run.Game.frameArea) / (run.Game.tileSizePixelRatio)));
    run.Game.tileSizeVector = new objects.utility.Vector(((run.Game.frameArea) / (run.Game.tileSizePixelRatio)), ((run.Game.frameArea) / (run.Game.tileSizePixelRatio)));
    player.resized(this);
    hotbar.resized();
}