private void restartCrate(org.apache.mesos.ExecutorDriver driver) {
    io.crate.frameworks.mesos.CrateExecutor.LOGGER.debug("Restart Crate process.");
    task.process.destroy();
    task.process = null;
    startProcess(driver, task);
}