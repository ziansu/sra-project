private org.json.JSONObject processChildren(final java.lang.Iterable<org.opendaylight.yangtools.yang.model.api.DataSchemaNode> nodes, final java.lang.String moduleName, final org.json.JSONObject models, final org.opendaylight.yangtools.yang.model.api.SchemaContext schemaContext) throws java.io.IOException, org.json.JSONException {
    return processChildren(nodes, moduleName, models, true, schemaContext);
}