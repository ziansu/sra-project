public final boolean isResultAvailable() {
    return (glGetQueryObjecti(target, clientapi.util.render.gl.GL_QUERY_RESULT_AVAILABLE)) == (GL_TRUE);
}