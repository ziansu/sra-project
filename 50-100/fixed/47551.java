@java.lang.Override
public void update() {
    if ((defaultFBO) == null) {
        inputFbo = fbosManager.get(fboURN);
    }else {
        this.inputFbo = defaultFBO.getFbo();
        this.fboURN = defaultFBO.getName();
    }
    if ((task) != null) {
        task.setTextureId(fetchTextureId());
    }
}