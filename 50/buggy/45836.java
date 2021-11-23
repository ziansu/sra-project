protected float[] getMvMatrix(float[] mMatrix, float[] vMatrix) {
    float[] mvMatrix = new float[16];
    android.opengl.Matrix.multiplyMM(mvMatrix, 0, vMatrix, 0, mMatrix, 0);
    return mvMatrix;
}