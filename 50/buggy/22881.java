@java.lang.Override
public void close() throws java.io.IOException {
    super.close();
    this.stopContainer(containerName);
    org.hobbit.odin.systems.virtuoso.VirtuosoSystemAdapter.LOGGER.info("Virtuoso has stopped.");
}