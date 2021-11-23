public void stopAnalysis() {
    isAnalysing = false;
    try {
        this.audioUpdaterThread.join();
    } catch (java.lang.InterruptedException e) {
    }
}