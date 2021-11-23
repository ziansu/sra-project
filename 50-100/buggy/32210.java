private void updateAttack(int deltaMs) {
    if ((dashTimeLeftMs) > 0) {
        dashTimeLeftMs -= deltaMs;
        if ((dashTimeLeftMs) < 0) {
            attackFrameAnimator.start();
            attackFrameAnimator.update((-(dashTimeLeftMs)));
            dashTimeLeftMs = 0;
            velocity.x = 0;
        }
    }else
        attackFrameAnimator.update(deltaMs);
    
}