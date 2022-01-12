public org.tiogasolutions.couchace.core.api.request.PutDesignRequest design(java.lang.String designName, java.lang.String designContent, java.lang.String documentRevision) {
    org.tiogasolutions.couchace.core.internal.util.ArgUtil.assertNotNull(designName, "designName");
    org.tiogasolutions.couchace.core.internal.util.ArgUtil.assertNotNull(designContent, "designContent");
    org.tiogasolutions.couchace.core.internal.util.ArgUtil.assertNotNull(documentRevision, "documentRevision");
    return new org.tiogasolutions.couchace.core.api.request.PutDesignRequest(requestExecutor, designName, documentRevision, designContent);
}