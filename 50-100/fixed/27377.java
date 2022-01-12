public static com.jukusoft.libgdx.rpg.engine.entity.Entity createParticlesEntity(com.jukusoft.libgdx.rpg.engine.entity.EntityManager ecs, java.lang.String particleFile, com.badlogic.gdx.graphics.Texture lightMap, float x, float y) {
    com.jukusoft.libgdx.rpg.engine.entity.Entity entity = new com.jukusoft.libgdx.rpg.engine.entity.Entity(ecs);
    entity.addComponent(new com.jukusoft.libgdx.rpg.engine.entity.factory.PositionComponent(x, y), com.jukusoft.libgdx.rpg.engine.entity.factory.PositionComponent.class);
    entity.addComponent(new com.jukusoft.libgdx.rpg.engine.entity.factory.DrawParticlesComponent(particleFile, true, true), com.jukusoft.libgdx.rpg.engine.entity.factory.DrawParticlesComponent.class);
    entity.addComponent(new com.jukusoft.libgdx.rpg.engine.entity.factory.LightMapComponent(lightMap, 0, 0, false), com.jukusoft.libgdx.rpg.engine.entity.factory.LightMapComponent.class);
    return entity;
}