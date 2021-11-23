public void drop(co.cask.cdap.proto.Id.DatasetInstance instance) throws java.lang.Exception {
    ensureNamespaceExists(instance.getNamespace());
    co.cask.cdap.data2.datafabric.dataset.service.DatasetInstanceService.LOG.info("Deleting dataset {}.{}", instance.getNamespaceId(), instance.getId());
    co.cask.cdap.api.dataset.DatasetSpecification spec = instanceManager.get(instance);
    if (spec == null) {
        throw new co.cask.cdap.common.DatasetNotFoundException(instance);
    }
    dropDataset(instance, spec);
}