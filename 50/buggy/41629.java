private com.graphicsengine.spritemesh.SpriteMeshNode getSpriteNode(com.nucleus.scene.RootNode root) {
    return ((com.graphicsengine.spritemesh.SpriteMeshNode) (root.getScene().getNodeByType(GraphicsEngineNodeType.spriteMeshNode.name())));
}