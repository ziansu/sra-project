public void run() {
    animator = new domino.FPSAnimator(canvas, fpsCap);
    animator.setRunAsFastAsPossible(true);
    animator.start();
}