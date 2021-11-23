private void update() {
    if (isInitialized) {
        if (isFilling) {
            startForwardProgressAnimator();
            if (animateColors) {
                startForwardColorAnimator();
            }
        }else {
            stopForwardProgressAnimator();
            if ((isReverseAnimationEnabled) && (!(isHoldAtLastPosition))) {
                startReverseProgressAnimator();
                if (animateColors) {
                    startReverseColorAnimator();
                }
            }else {
                if (animateColors) {
                    stopForwardColorAnimator();
                }
                if (!(isHoldAtLastPosition)) {
                    mAngle = 0;
                }
            }
        }
    }
}