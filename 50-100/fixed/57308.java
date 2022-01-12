@java.lang.Override
public void createScene() {
    setBackground(new org.andengine.entity.scene.background.Background(0, 100, 200));
    arkanoidPhysicsWorld = new org.andengine.extension.physics.box2d.PhysicsWorld(new com.badlogic.gdx.math.Vector2(0, 0), false);
    registerUpdateHandler(arkanoidPhysicsWorld);
    createFixtures();
    createWallSprites();
    createWallBodies();
    createBallSprite();
    createPlatformSprite();
    setPhysicsConnectors();
}