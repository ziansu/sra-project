public org.tiogasolutions.couchace.core.api.request.PutDesignRequest design(java.lang.String designName, java.net.URL designFile, java.lang.String documentRevision) {
    org.tiogasolutions.couchace.core.internal.util.ArgUtil.assertNotNull(designName, "designName");
    org.tiogasolutions.couchace.core.internal.util.ArgUtil.assertNotNull(designFile, "designFile");
    org.tiogasolutions.couchace.core.internal.util.ArgUtil.assertNotNull(documentRevision, "documentRevision");
    java.lang.String designBody = org.tiogasolutions.couchace.core.internal.util.IOUtil.readText(designFile);
    return new org.tiogasolutions.couchace.core.api.request.PutDesignRequest(requestExecutor, designName, documentRevision, designBody);
}