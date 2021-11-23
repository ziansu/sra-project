public void shoot() {
    if (gun.shoot(body.getPosition(), isFacingLeft)) {
        animator.setAnimationShooting();
        isShooting = true;
        com.vertextrigger.entities.player.Timer.schedule(new com.badlogic.gdx.utils.Timer.Task() {
            @java.lang.Override
            public void run() {
                isShooting = false;
            }
        }, 0.1F);
    }
}