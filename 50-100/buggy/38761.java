private java.lang.String getClientBdmJarClassPath(final java.lang.String bonitaHomePath) {
    java.lang.String clientBdmJarPath;
    clientBdmJarPath = new java.lang.StringBuilder().append(bonitaHomePath).append(java.io.File.separator).append("engine-server").append(java.io.File.separator).append("work").append(java.io.File.separator).append("tenants").append(java.io.File.separator).append(tenantId).append(java.io.File.separator).append("data-management-client").toString();
    return clientBdmJarPath;
}