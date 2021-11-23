private static int glcondi(haven.GL gl, int param, int def) {
    int[] buf = new int[]{ 0 };
    gl.glGetIntegerv(param, buf, 0);
    if ((gl.glGetError()) != 0)
        return -1;
    
    return buf[0];
}