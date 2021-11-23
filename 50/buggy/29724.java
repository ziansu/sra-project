public void cancelOptimization() {
    if (((this.optimizationThread) != null) && (this.optimizationThread.isAlive())) {
        this.globalOptimization.cancelOptimization();
        this.optimizationThread.interrupt();
    }
}