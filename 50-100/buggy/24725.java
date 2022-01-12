private void searchGameObjectChildrenForSelection(com.suiton2d.scene.GameObject gameObject, java.util.List<com.suiton2d.editor.framework.Selection> selections, float x, float y) {
    for (com.badlogic.gdx.scenes.scene2d.Actor child : gameObject.getChildren()) {
        com.suiton2d.scene.GameObject g = ((com.suiton2d.scene.GameObject) (child));
        if (isGameObjectSelected(g, getCamera(), x, ((getCamera().viewportHeight) - y))) {
            selections.add(new com.suiton2d.editor.framework.Selection(g));
        }else {
            searchGameObjectChildrenForSelection(g, selections, x, y);
        }
    }
}