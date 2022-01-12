public void update(float deltaTime) {
    for (int i = 0; i < (entities.size()); i++) {
        xyz.autholius.game.components.CollisionComponent cc = CollisionComponent.m.get(entities[i]);
        if (!(cc.main)) {
            continue;
        }
    }
}