public static boolean isValidAppNamespace(java.lang.String name) {
    if (com.ctrip.framework.apollo.core.utils.StringUtils.isEmpty(name)) {
        return false;
    }
    return (com.ctrip.framework.apollo.common.utils.InputValidator.CLUSTER_NAMESPACE_PATTERN.matcher(name).matches()) && (com.ctrip.framework.apollo.common.utils.InputValidator.APP_NAMESPACE_PATTERN.matcher(name).matches());
}