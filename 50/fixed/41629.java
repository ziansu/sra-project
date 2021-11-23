private com.graphicsengine.spritemesh.SpriteMeshNode getSpriteNode(com.nucleus.scene.RootNode root) {
    if (root == null) {
        return null;
    }
    return ((com.graphicsengine.spritemesh.SpriteMeshNode) (root.getScene().getNodeByType(GraphicsEngineNodeType.spriteMeshNode.name())));
}