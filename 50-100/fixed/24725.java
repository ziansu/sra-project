private void searchGameObjectChildrenForSelection(com.suiton2d.scene.GameObject gameObject, java.util.List<com.suiton2d.editor.framework.Selection> selections, float x, float y) {
    if (isGameObjectSelected(gameObject, getCamera(), x, ((getCamera().viewportHeight) - y)))
        selections.add(new com.suiton2d.editor.framework.Selection(gameObject));
    
    for (com.badlogic.gdx.scenes.scene2d.Actor child : gameObject.getChildren()) {
        com.suiton2d.scene.GameObject g = ((com.suiton2d.scene.GameObject) (child));
        searchGameObjectChildrenForSelection(g, selections, x, y);
    }
}