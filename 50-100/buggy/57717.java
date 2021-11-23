@java.lang.Override
public com.netflix.metacat.common.dto.TableDto createMView(final java.lang.String catalogName, final java.lang.String databaseName, final java.lang.String tableName, final java.lang.String viewName, final java.lang.Boolean snapshot, final java.lang.String filter) {
    final com.netflix.metacat.common.QualifiedName name = com.netflix.metacat.main.api.RequestWrapper.qualifyName(() -> com.netflix.metacat.common.QualifiedName.ofView(catalogName, databaseName, tableName, viewName));
    return com.netflix.metacat.main.api.RequestWrapper.requestWrapper(name, "createMView", () -> mViewService.createAndSnapshotPartitions(name, snapshot, filter));
}