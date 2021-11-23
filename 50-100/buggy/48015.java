@java.lang.Override
public void onContactEnded(com.badlogic.gdx.physics.bullet.collision.btCollisionObject colObj0, com.badlogic.gdx.physics.bullet.collision.btCollisionObject colObj1) {
    if ((colObj0.getContactCallbackFlag()) == (CollisionHandler.OBJECT_FLAG)) {
    }
    if ((colObj0.getContactCallbackFlag()) == (CollisionHandler.GROUND_FLAG)) {
    }
    java.lang.System.out.println("fly");
    if (!(timerIsOn)) {
        timerIsOn = true;
        setOnGround = com.badlogic.gdx.utils.Timer.schedule(new com.badlogic.gdx.utils.Timer.Task() {
            @java.lang.Override
            public void run() {
                player.onGround = false;
            }
        }, 0.1F);
    }
    player.gravity = true;
}