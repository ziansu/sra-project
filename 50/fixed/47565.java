private boolean hasHeader(final org.apache.http.HttpResponse response, final java.lang.String x_content_sha256) {
    final java.lang.String sha256Header = findHeader(response, no.digipost.api.client.Headers.X_Content_SHA256);
    return !(org.apache.commons.lang3.StringUtils.isBlank(sha256Header));
}