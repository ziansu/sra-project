private void showInitialIntent(boolean isVisible) {
    editableIntent = uk.co.ashtonbrsc.intentexplode.Explode.cloneIntent(originalIntent);
    editableIntent.setComponent(null);
    setupVariables();
    setupTextWatchers();
    showAllIntentData(null);
    showResetIntentButton(isVisible);
}