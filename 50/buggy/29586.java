private void stopCrawling() {
    for (com.samsanort.yac4j.process.CycleRunner runner : this.cycleRunners_) {
        runner.kill();
    }
    this.cycleRunners_ = null;
}