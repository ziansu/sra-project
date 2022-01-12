private void bindTexture(go.graphics.TextureHandle texture) throws go.graphics.IllegalBufferException {
    int id;
    if (texture == null) {
        id = 0;
    }else {
        if (!(texture.isValid())) {
            throw new go.graphics.IllegalBufferException(("Texture handle is not valid: " + texture));
        }
        id = texture.getInternalId();
        gl2.glBindTexture(GL.GL_TEXTURE_2D, id);
    }
}