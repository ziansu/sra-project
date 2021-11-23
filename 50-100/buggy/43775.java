@java.lang.Override
public void dispose() {
    if ((this.flusher.pixmap) != null) {
        this.flusher.pixmap.dispose();
        this.flusher.pixmap = null;
    }
    this.fbo.dispose();
    this.mesh.dispose();
    this.mesh = null;
    this.meshShader.dispose();
    this.meshShader = null;
}