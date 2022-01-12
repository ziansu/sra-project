@java.lang.Override
public void addProgress(int totalProgress) {
    hideProgressCounter.incrementCounter();
    if ((hideProgressCounter.getValue()) >= totalProgress) {
        if (showAE.isWaitForHideAnimationComplete())
            showAE.getShow().start(animate, showAEL);
        
    }
}