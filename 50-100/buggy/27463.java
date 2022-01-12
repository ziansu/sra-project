@java.lang.Override
protected void processEntity(com.badlogic.ashley.core.Entity entity, float deltaTime) {
    com.badlogic.gdx.graphics.g2d.TextureRegion tr = rm.get(entity).region;
    batch.draw(tr, ((tr.getRegionWidth()) * (gameScale)), ((tr.getRegionHeight()) * (gameScale)), tm.get(entity).transform);
}