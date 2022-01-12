public void startAnim(int step) {
    if (step == 1) {
        stopAnim();
        startViewAnim(0.0F, 1.0F, 600, step);
    }else
        if (step == 2) {
            startViewAnim(0.0F, 1.0F, 400, step);
        }
    
}