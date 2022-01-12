private static int compileShader(java.lang.String source, int type) throws com.ssrpro.cryo.ps.CompileException {
    int shader = glCreateShader(type);
    glShaderSource(shader, source);
    glCompileShader(shader);
    if ((glGetShaderi(shader, com.ssrpro.cryo.ps.GL_COMPILE_STATUS)) == (GL_FALSE)) {
        glDeleteShader(shader);
        throw new com.ssrpro.cryo.ps.CompileException(("Error compiling render shader\n" + (glGetShaderInfoLog(shader, glGetShaderi(shader, com.ssrpro.cryo.ps.GL_INFO_LOG_LENGTH)))));
    }
    return shader;
}