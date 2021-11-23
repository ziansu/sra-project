@java.lang.Override
public void addProgress(int totalProgress) {
    if ((hideProgressCounter.getValue()) <= totalProgress) {
        if (showAE.isWaitForHideAnimationComplete())
            showAE.getShow().start(animate, showAEL);
        
    }
    hideProgressCounter.incrementCounter();
}