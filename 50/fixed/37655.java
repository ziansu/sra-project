public void clearColor(com.nilunder.bdx.utils.Color color) {
    com.nilunder.bdx.Bdx.clearColor.set(color);
    com.nilunder.bdx.Bdx.clearColor.a = 0;
    Gdx.gl.glClearColor(color.r, color.g, color.b, 0);
}