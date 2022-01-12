@javax.annotation.Nullable
private java.util.List<co.cask.wrangler.api.Record> getWorkspace(java.lang.String workspaceName, co.cask.cdap.api.service.http.HttpServiceResponder responder) {
    co.cask.cdap.api.dataset.table.Row row = workspace.get(co.cask.cdap.api.common.Bytes.toBytes(workspaceName));
    java.lang.String data = co.cask.cdap.api.common.Bytes.toString(row.get("data"));
    if ((data == null) || (data.isEmpty())) {
        co.cask.wrangler.service.WranglerService.error(responder, "No data exists in the workspace. Please upload the data to this workspace.");
        return null;
    }
    return co.cask.wrangler.service.WranglerService.GSON.fromJson(data, new co.cask.cdap.internal.guava.reflect.TypeToken<java.util.List<co.cask.wrangler.api.Record>>() {    }.getType());
}