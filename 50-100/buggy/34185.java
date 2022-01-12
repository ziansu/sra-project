@java.lang.Override
public java.lang.String toString() {
    java.lang.String url = (baseUrl) + (getPaths().stream().collect(java.util.stream.Collectors.joining(com.hpe.adm.nga.sdk.OctaneUrl.PATH_SEPARATOR)));
    url = ((queryParams.size()) > 0) ? (url + "?") + (createQueryString()) : url;
    return url;
}