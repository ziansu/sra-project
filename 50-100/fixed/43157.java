@java.lang.Override
public java.lang.Integer getPage(okhttp3.Response response) {
    if (isPaginated(response)) {
        java.lang.String header = response.headers().get("Link");
        if (null != header) {
            java.lang.String[] parts = header.split(",");
            for (java.lang.String part : parts) {
                com.alorma.github.sdk.core.datasource.PaginationLink bottomPaginationLink = new com.alorma.github.sdk.core.datasource.PaginationLink(part);
                if ((bottomPaginationLink.rel) == (RelType.next)) {
                    return bottomPaginationLink.page;
                }
            }
        }
    }
    return null;
}