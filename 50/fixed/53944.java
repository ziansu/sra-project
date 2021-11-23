public static void main(java.lang.String[] args) {
    try {
        new lu.innocence.opengl.Main();
    } catch (lu.innocence.opengl.core.exception.GLFWException e) {
        lu.innocence.opengl.Main.LOGGER.error(e);
        java.lang.System.exit((-1));
    }
}