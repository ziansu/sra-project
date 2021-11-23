public void initialize(final java.util.function.BooleanSupplier autoAdjustResolution, final java.lang.Runnable updateUI) {
    if (autoAdjustResolution == null) {
        throw new java.lang.NullPointerException("autoAdjustResolution not provided");
    }
    if (updateUI == null) {
        throw new java.lang.NullPointerException("updateUI not provided");
    }
    java.util.Locale.setDefault(java.util.Locale.ROOT);
    it.paspiz85.nanobot.util.Settings.initialize();
    logger.log(java.util.logging.Level.INFO, "Settings loaded");
    initRunningService(autoAdjustResolution, updateUI);
    initScriptService(updateUI);
}