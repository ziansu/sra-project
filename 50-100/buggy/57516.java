private boolean getCompileStatus(int shaderHandle, java.lang.String shaderName) {
    if ((glGetShaderi(shaderHandle, de.nerogar.noise.render.GL_COMPILE_STATUS)) == (org.lwjgl.opengl.GL11.GL_FALSE)) {
        int errorSize = glGetShaderi(shaderHandle, de.nerogar.noise.render.GL_INFO_LOG_LENGTH);
        de.nerogar.noise.util.Logger.log(Logger.ERROR, ((shaderName + " wasn\'t able to be compiled correctly. Error log:\n") + (glGetShaderInfoLog(vertexShaderHandle, errorSize))));
        return true;
    }
    return false;
}