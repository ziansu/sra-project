@jsinterop.annotations.JsIgnore
private void updateTextures(java.lang.Object texture) {
    java.lang.Object[] updatedTextures = new java.lang.Object[(getTextures().length) + 1];
    if ((this.textures.length) > 0) {
        for (int i = 0; i < (updatedTextures.length); i++) {
            updatedTextures[i] = this.textures[i];
        }
    }
    updatedTextures[textures.length] = texture;
    this.textures = updatedTextures;
}