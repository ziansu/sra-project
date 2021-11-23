private static int getPageSize(final java.lang.Integer preferredPageSize) {
    return preferredPageSize == null ? org.wso2.carbon.dataservices.core.odata.QueryHandler.MAX_PAGE_SIZE : preferredPageSize;
}