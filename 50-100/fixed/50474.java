private void update() {
    for (objects.GameObject go : gameObjects)
        go.update();
    
    for (objects.GameObject go : adds)
        gameObjects.add(go);
    
    for (objects.GameObject go : removes)
        gameObjects.remove(go);
    
    adds.clear();
    removes.clear();
}