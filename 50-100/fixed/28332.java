private void onCollisionMelonManWithGround(com.hess.assignment1.Ground ground) {
    com.hess.assignment1.MelonMan melonMan = level.melonMan;
    switch (melonMan.jumpState) {
        case GROUNDED :
            break;
        case FALLING :
        case JUMP_FALLING :
            melonMan.position.y = ((ground.position.y) + (melonMan.bounds.height)) - 0.3F;
            melonMan.jumpState = com.hess.assignment1.MelonMan.JUMP_STATE.GROUNDED;
            break;
        case JUMP_RISING :
            melonMan.position.y = ((ground.position.y) + (melonMan.bounds.height)) - 0.3F;
            break;
    }
}