@java.lang.Override
public void dispose() {
    if ((this.flusher.pixmap) != null) {
        this.flusher.pixmap.dispose();
        this.flusher.pixmap = null;
    }
    if ((fbo) != null) {
        fbo.dispose();
        fbo = null;
    }
    this.mesh.dispose();
    this.mesh = null;
    this.meshShader.dispose();
    this.meshShader = null;
}