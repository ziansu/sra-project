public static void checkGlError(java.lang.String glOperation) {
    int error;
    while ((error = android.opengl.GLES20.glGetError()) != (android.opengl.GLES20.GL_NO_ERROR)) {
        android.util.Log.e("GridGLRenderer", ((glOperation + ": glError ") + error));
        throw new java.lang.RuntimeException(((glOperation + ": glError ") + error));
    } 
}