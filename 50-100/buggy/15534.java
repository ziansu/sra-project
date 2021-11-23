@java.lang.Override
public void onDrawFrame(javax.microedition.khronos.opengles.GL10 glUnused) {
    glClear(com.example.travis.a3dmodeller.GL_COLOR_BUFFER_BIT);
    multiplyMM(viewProjectionMatrix, 0, projectionMatrix, 0, viewMatrix, 0);
    positionPlaneInScene();
    colorProgram.useProgram();
    colorProgram.setUniforms(modelViewProjectionMatrix, 1.0F, 0.0F, 0.0F);
    sphere.bindData(colorProgram);
    sphere.draw();
    colorProgram.setUniforms(modelViewProjectionMatrix, 1.0F, 1.0F, 0.7F);
    plane.bindData(colorProgram);
    plane.draw();
}