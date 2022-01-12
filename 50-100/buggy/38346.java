private io.crate.metadata.doc.DocTableInfo innerGetTableInfo(java.lang.String name) {
    boolean checkAliasSchema = clusterService.state().metaData().settings().getAsBoolean("crate.table_alias.schema_check", true);
    io.crate.metadata.doc.DocTableInfoBuilder builder = new io.crate.metadata.doc.DocTableInfoBuilder(functions, new io.crate.metadata.TableIdent(name(), name), clusterService, indexNameExpressionResolver, transportPutIndexTemplateAction, executorService, checkAliasSchema);
    return builder.build();
}