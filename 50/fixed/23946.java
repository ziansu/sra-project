private void restartCrate(org.apache.mesos.ExecutorDriver driver) {
    io.crate.frameworks.mesos.CrateExecutor.LOGGER.debug("Restart Crate process.");
    task.destroy();
    startProcess(driver, task);
}