public boolean clearScreen(float red, float green, float blue) {
    gl.glClearColor(red, green, blue, 1.0F);
    gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
    update = true;
    return true;
}