private void update() {
    for (objects.GameObject go : gameObjects)
        go.update();
    
    for (objects.GameObject go : adds)
        gameObjects.add(go);
    
    for (objects.GameObject go : removes) {
        java.lang.System.out.println(("Removing " + (gameObjects.size())));
        gameObjects.remove(go);
        java.lang.System.out.println(("Removed " + (gameObjects.size())));
    }
    adds.clear();
    removes.clear();
}