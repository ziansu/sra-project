public void setScene(lamao.soh.core.SHScene scene) {
    if (((this.scene) != null) && ((this.scene) != scene)) {
        rootNode.detachChild(this.scene.getRootNode());
    }
    this.scene = scene;
    rootNode.attachChild(this.scene.getRootNode());
}