@java.lang.Override
public void render(org.helioviewer.jhv.camera.Camera camera, org.helioviewer.jhv.display.Viewport vp, com.jogamp.opengl.GL2 gl) {
    if (!(inited))
        return ;
    
    GLSLLineShader.line.bind(gl);
    GLSLLineShader.line.setAspect(((float) (vp.aspect)));
    GLSLLineShader.line.bindParams(gl);
    bindVBOs(gl);
    gl.glDrawElements(GL2.GL_TRIANGLES, vbos[4].bufferSize, GL2.GL_UNSIGNED_INT, 3);
    unbindVBOs(gl);
    org.helioviewer.jhv.opengl.GLSLShader.unbind(gl);
}