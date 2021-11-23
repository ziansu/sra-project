public void resized() {
    run.Game.tileSize = ((int) ((run.Game.frameArea) / (run.Game.tileSizePixelRatio)));
    run.Game.tileSizeVector = new objects.utility.Vector(((run.Game.frameArea) / (run.Game.tileSizePixelRatio)), ((run.Game.frameArea) / (run.Game.tileSizePixelRatio)));
    java.lang.System.out.println((((run.Game.frameArea) + "   ") + (new java.lang.Integer(((int) (run.Game.tileSizePixelRatio))).toString())));
    player.resized(this);
    hotbar.resized();
}