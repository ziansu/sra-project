public void run() {
    domino.FPSAnimator animator = new domino.FPSAnimator(canvas, fpsCap);
    animator.setRunAsFastAsPossible(true);
    animator.start();
}