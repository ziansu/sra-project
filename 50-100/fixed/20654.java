public static void walk(float walkSpeed) {
    getPlayer().setState(State.WALKING);
    walkSpeed -= WorldPhysic.playerBody.getLinearVelocity().x;
    WorldPhysic.playerBody.applyLinearImpulse(new com.badlogic.gdx.math.Vector2(walkSpeed, 0), WorldPhysic.playerBody.getWorldCenter(), true);
}