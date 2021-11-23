@java.lang.Override
public java.lang.String toString() {
    java.lang.String url = baseUrl;
    if ((getPaths().size()) > 0) {
        url += (com.hpe.adm.nga.sdk.OctaneUrl.PATH_SEPARATOR) + (getPaths().stream().collect(java.util.stream.Collectors.joining(com.hpe.adm.nga.sdk.OctaneUrl.PATH_SEPARATOR)));
    }
    url = ((queryParams.size()) > 0) ? (url + "?") + (createQueryString()) : url;
    return url;
}