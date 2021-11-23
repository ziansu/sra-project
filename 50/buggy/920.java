public final int getResult() {
    return glGetQueryObjecti(target, clientapi.util.render.gl.GL_QUERY_RESULT);
}