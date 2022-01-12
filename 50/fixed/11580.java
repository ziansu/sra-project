@java.lang.Override
public void dispose() {
    this.shader.dispose();
    this.mesh.dispose();
    if ((this.frameBuffer) != null) {
        this.frameBuffer.dispose();
    }
}