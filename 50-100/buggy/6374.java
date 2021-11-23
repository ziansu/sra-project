protected void updateTextureCoordinates(de.phbouillon.android.games.alite.screens.opengl.sprites.SpriteData sprite) {
    texCoordBuffer.clear();
    texCoordBuffer.put(sprite.x);
    texCoordBuffer.put(sprite.y);
    texCoordBuffer.put(sprite.x);
    texCoordBuffer.put(sprite.y2);
    texCoordBuffer.put(sprite.x2);
    texCoordBuffer.put(sprite.y);
    texCoordBuffer.put(sprite.x2);
    texCoordBuffer.put(sprite.y2);
    texCoordBuffer.position(0);
}