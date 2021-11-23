public void finish() {
    if (enabled) {
        if ((n) > (lastPrintN)) {
            long elapsed = (java.lang.System.currentTimeMillis()) - (this.startTime);
            java.lang.System.out.print('\r');
            java.lang.System.out.println(org.bunkr.cli.ProgressBar.formatStateWithRate(n, total, width, title, elapsed));
        }
    }
}