public void update() {
    for (com.example.simon.ballapp.GameObject go : com.example.simon.ballapp.GameWorld.getGameObjects()) {
        if ((go != (this)) && (hasCollision(go))) {
            onCollision(go);
            break;
        }
    }
}