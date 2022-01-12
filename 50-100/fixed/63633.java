@java.lang.Override
public void onEnter() {
    com.shc.lostorion.states.PlayState.SCENE = new com.shc.silenceengine.scene.Scene2D();
    collider = new com.shc.silenceengine.collision.colliders.SceneCollider2D(new com.shc.silenceengine.collision.broadphase.DynamicTree2D());
    collider.setScene(com.shc.lostorion.states.PlayState.SCENE);
    collider.register(Resources.CollisionTags.SHIP, Resources.CollisionTags.BLOCK);
    collider.register(Resources.CollisionTags.SHIP, Resources.CollisionTags.ROLLER);
    collider.register(Resources.CollisionTags.BLACK_BOX, Resources.CollisionTags.SHIP);
    collider.register(Resources.CollisionTags.BULLET, Resources.CollisionTags.BLOCK);
    collider.register(Resources.CollisionTags.BULLET, Resources.CollisionTags.ROLLER);
    collider.register(Resources.CollisionTags.ROLLER, Resources.CollisionTags.BLOCK);
    Resources.Levels.TEST.create();
}