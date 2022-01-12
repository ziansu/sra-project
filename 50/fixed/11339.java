protected java.nio.FloatBuffer storeMatrix(matrix.Matrix4f mat) {
    mat.store(buf);
    buf.flip();
    return buf;
}