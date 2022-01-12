public com.jme3.scene.Node LoadModel() {
    com.jme3.scene.Node jaime = ((com.jme3.scene.Node) (((com.jme3.scene.Node) (assetManager.loadModel("Models/Jaime.xbuf"))).getChild("Armature")));
    jaime.setShadowMode(RenderQueue.ShadowMode.CastAndReceive);
    rootNode.attachChild(jaime);
    return jaime;
}