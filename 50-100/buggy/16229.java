public void bindSamplers() {
    for (int i = 0; i < (textureUnit.length); i++) {
        if ((com.pi.core.glsl.ShaderProgram.ACTIVE_TEXTURE_UNITS[i]) != (textureUnit[i])) {
            org.lwjgl.opengl.GL13.glActiveTexture(((org.lwjgl.opengl.GL13.GL_TEXTURE0) + i));
            if ((textureUnit[i]) != null)
                textureUnit[i].bind();
            else
                com.pi.core.texture.Texture.unbind();
            
            com.pi.core.glsl.ShaderProgram.ACTIVE_TEXTURE_UNITS[i] = textureUnit[i];
        }
    }
}