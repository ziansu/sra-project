private void update() {
    if (isInitialized) {
        if (isFilling) {
            startForwardProgressAnimator();
            if (animateColors) {
                startForwardColorAnimator();
            }
        }else {
            stopForwardProgressAnimator();
            if (!(isHoldAtLastPosition)) {
                if (isReverseAnimationEnabled) {
                    startReverseProgressAnimator();
                    if (animateColors) {
                        startReverseColorAnimator();
                    }
                }else {
                    if (animateColors) {
                        stopForwardColorAnimator();
                    }
                    mAngle = 0;
                }
            }
        }
    }
}