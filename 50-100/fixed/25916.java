public void animatedStepProgress(int count) {
    progressBar.setFill(((progressBar.getFillAmount()) + (count * (stepInFill))));
    if ((progressBar.getFillAmount()) >= (thresholds.get(0).value)) {
        reachedThreshold();
    }
    starsToNextThresholdLabel.setText(java.lang.Integer.toString((((starsToNextUnlock(count, false)) - (Vescape.lastTotalStars)) - count)));
}