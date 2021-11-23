private static int getPageSize(final int skipTokenPageSize, final java.lang.Integer preferredPageSize) {
    return skipTokenPageSize > 0 ? skipTokenPageSize : (preferredPageSize == null) || (preferredPageSize >= (org.wso2.carbon.dataservices.core.odata.QueryHandler.MAX_PAGE_SIZE)) ? org.wso2.carbon.dataservices.core.odata.QueryHandler.MAX_PAGE_SIZE : preferredPageSize;
}