@java.lang.Override
public void destroy() {
    destroyContentStoreContext(context);
    org.craftercms.deployer.impl.processors.SearchIndexingProcessor.logger.debug("Content store context destroyed: {}", context);
}