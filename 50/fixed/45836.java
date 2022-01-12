protected float[] getMvMatrix(float[] mMatrix, float[] vMatrix) {
    android.opengl.Matrix.multiplyMM(mvMatrix, 0, vMatrix, 0, mMatrix, 0);
    return mvMatrix;
}