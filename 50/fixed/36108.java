@java.lang.Override
public java.util.Collection<java.lang.String> findAllIds() {
    if (isMultiTenant()) {
        return findAllIds(com.frs.alto.util.TenantUtils.getThreadTenant());
    }else {
        return findAllIds(null);
    }
}