public void setSyncProgressBar(java.lang.Double progress) {
    while ((syncProgressBar) == null);
    syncProgressBar.setProgress(progress.intValue());
}