@java.lang.Override
public void stop() throws java.lang.Exception {
    if (((filter) != null) && ((filter.getNodesCollector()) != null)) {
        filter.getNodesCollector().stop();
    }
    super.stop();
}