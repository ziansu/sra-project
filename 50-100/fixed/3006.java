public static com.badlogic.gdx.graphics.g2d.TextureRegion[][] splitSheet(java.lang.String sprite_sheet, float rows, float cols) {
    com.badlogic.gdx.graphics.Texture atlas = new com.badlogic.gdx.graphics.Texture(sprite_sheet);
    return com.badlogic.gdx.graphics.g2d.TextureRegion.split(atlas, ((int) ((atlas.getWidth()) / cols)), ((int) ((atlas.getHeight()) / rows)));
}