private void run(org.openlca.core.model.ProductSystem system, org.openlca.core.matrix.LongPair processProduct) {
    log.trace("build product index");
    org.openlca.core.matrix.product.index.IProductIndexBuilder builder = getProductIndexBuilder(system);
    builder.setPreferredType((preferSystemProcesses ? org.openlca.core.model.ProcessType.LCI_RESULT : org.openlca.core.model.ProcessType.UNIT_PROCESS));
    org.openlca.core.matrix.ProductIndex index = builder.build(processProduct);
    log.trace("built a product index with {} process products and {} links", index.size(), index.getLinkedInputs().size());
    log.trace("create new process links");
    addLinksAndProcesses(system, index);
}