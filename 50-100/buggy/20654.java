public static void walk(float walkSpeed) {
    getPlayer().setState(State.WALKING);
    java.lang.System.out.println("in walk of characterControl");
    walkSpeed -= WorldPhysic.playerBody.getLinearVelocity().x;
    WorldPhysic.playerBody.applyLinearImpulse(new com.badlogic.gdx.math.Vector2(walkSpeed, 0), WorldPhysic.playerBody.getWorldCenter(), true);
}