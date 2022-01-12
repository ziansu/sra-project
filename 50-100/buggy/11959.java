@java.lang.Override
public co.cask.cdap.store.NamespaceMDS get() {
    co.cask.cdap.api.dataset.table.Table table;
    try {
        table = dsCache.getDataset(co.cask.cdap.store.DefaultNamespaceStore.APP_META_INSTANCE_ID.getId());
    } catch (co.cask.cdap.api.data.DatasetInstantiationException e) {
        try {
            table = co.cask.cdap.data2.datafabric.dataset.DatasetsUtil.getOrCreateDataset(dsFramework, co.cask.cdap.store.DefaultNamespaceStore.APP_META_INSTANCE_ID, "table", DatasetProperties.EMPTY, DatasetDefinition.NO_ARGUMENTS, null);
        } catch (co.cask.cdap.api.dataset.DatasetManagementException | java.io.IOException e1) {
            throw com.google.common.base.Throwables.propagate(e1);
        }
    }
    return new co.cask.cdap.store.NamespaceMDS(table);
}