@java.lang.Override
public java.lang.String getPackagePrefix(java.lang.String apiName, java.lang.String apiVersion) {
    return com.google.common.base.Joiner.on('.').join(com.google.api.codegen.discovery.config.java.JavaTypeNameGenerator.PACKAGE_PREFIX, apiName, apiVersion);
}