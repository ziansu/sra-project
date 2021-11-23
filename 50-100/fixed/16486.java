public void drawHitboxes(com.badlogic.gdx.graphics.glutils.ShapeRenderer sr) {
    if (renderHitboxes) {
        for (int i = 0; i < (entities.size()); i++) {
            java.util.ArrayList<xyz.autholius.game.ecs.components.SpaceComponent> hb = CollisionComponent.m.get(entities.get(i)).hitboxes;
            for (int j = 0; j < (hb.size()); j++) {
                sr.polygon(hb.get(j).getPoly().getVertices());
            }
        }
    }
}