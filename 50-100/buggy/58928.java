private void drawModelObject(com.example.glttt.ModelObject modelObject) {
    float[] mvpMatrix = new float[16];
    android.opengl.Matrix.multiplyMM(mvpMatrix, 0, viewMatrix, 0, modelObject.getModelMatrix(), 0);
    android.opengl.Matrix.multiplyMM(mvpMatrix, 0, projectionMatrix, 0, mvpMatrix, 0);
    android.opengl.GLES20.glUniformMatrix4fv(vpMatrixHandle, 1, false, mvpMatrix, 0);
    modelObject.draw(positionHandle, colourHandle);
    android.opengl.GLES20.glDrawArrays(GLES20.GL_TRIANGLES, 0, 3);
}