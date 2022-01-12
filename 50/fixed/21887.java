public final boolean isResultAvailable() {
    return (glGetQueryObjecti(id(), clientapi.util.render.gl.GL_QUERY_RESULT_AVAILABLE)) == (GL_TRUE);
}