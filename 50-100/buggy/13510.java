private java.util.List<org.openxdata.client.model.FormSummary> convertFormResults(org.openxdata.server.admin.model.paging.PagingLoadResult<org.openxdata.server.admin.model.FormDef> result) {
    java.util.List<org.openxdata.client.model.FormSummary> results = new java.util.ArrayList<org.openxdata.client.model.FormSummary>();
    java.util.List<org.openxdata.server.admin.model.FormDef> forms = result.getData();
    for (org.openxdata.server.admin.model.FormDef fd : forms) {
        for (org.openxdata.server.admin.model.FormDefVersion fdv : fd.getVersions()) {
            results.add(new org.openxdata.client.model.FormSummary(fdv));
        }
    }
    return results;
}