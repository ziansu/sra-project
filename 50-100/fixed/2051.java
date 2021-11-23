public void watchAnimation() {
    if ((frameCount) > (damagePoint)) {
        healedBarDone = healedHealthBar.runFrame();
    }
    if ((frameCount) < (animationLength))
        (frameCount)++;
    
    if (((frameCount) >= (animationLength)) && (healedBarDone))
        controlState = 1;
    
}