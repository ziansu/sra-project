private com.badlogic.gdx.graphics.Texture getBGAData(int id, boolean cont) {
    if (((progress) != 1) || (id == (-1))) {
        return null;
    }
    final bms.player.beatoraja.play.bga.MovieProcessor mpg = mpgmap.get(id);
    if (mpg != null) {
        if (!cont) {
            mpg.play(false);
        }
        return mpg.getFrame();
    }
    return cache.getTexture(id);
}