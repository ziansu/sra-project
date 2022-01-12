@org.osgi.service.component.annotations.Reference(cardinality = org.osgi.service.component.annotations.ReferenceCardinality.MULTIPLE, policy = org.osgi.service.component.annotations.ReferencePolicy.DYNAMIC, policyOption = org.osgi.service.component.annotations.ReferencePolicyOption.GREEDY, target = "(indexer.class.name=*)", unbind = "removeIndexerPostProcessor")
protected void addIndexerPostProcessor(com.liferay.portal.kernel.search.IndexerPostProcessor indexerPostProcessor, java.util.Map<java.lang.String, java.lang.Object> properties) {
    java.util.List<java.lang.String> indexerClassNames = com.liferay.osgi.util.StringPlus.asList(properties.get("indexer.class.name"));
    for (java.lang.String indexerClassName : indexerClassNames) {
        com.liferay.portal.kernel.search.Indexer<?> indexer = getIndexer(indexerClassName);
        if (indexer == null) {
            com.liferay.portal.search.internal.IndexerRegistryImpl._log.error(("No indexer exists for " + indexerClassName));
            continue;
        }
        indexer.registerIndexerPostProcessor(indexerPostProcessor);
    }
}