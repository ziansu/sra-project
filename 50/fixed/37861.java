@java.lang.Override
public void update() {
    fboId = frameBuffersManager.getFBO(fboName).fboId;
    task.setFboId(fboId);
}