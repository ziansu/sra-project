public com.badlogic.gdx.graphics.g2d.TextureRegion get(java.lang.String name) {
    for (int i = 0; i < (tiles_index); i++) {
        if (tile_names[i].equals(name)) {
            return tiles[i];
        }
    }
    return placeholder;
}