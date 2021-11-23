public java.lang.String[] getData(org.apache.stratos.common.beans.TenantInfoBean tenant) {
    java.lang.String[] data = new java.lang.String[5];
    data[0] = tenant.getTenantDomain();
    data[1] = java.lang.String.valueOf(tenant.getTenantId());
    data[2] = java.lang.String.valueOf(tenant.isActive());
    data[3] = tenant.getEmail();
    data[4] = java.lang.String.valueOf(tenant.getCreatedDate());
    return data;
}