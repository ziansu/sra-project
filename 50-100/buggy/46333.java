private boolean containsSupportedMediaType(java.util.List<org.springframework.http.MediaType> mediaTypes) {
    org.restfulwhois.rdap.filters.httpFilter.HttpRequestFilter.LOGGER.debug("SUPPORTED_MEDIA_TYPE:{}", org.restfulwhois.rdap.filters.httpFilter.HttpRequestFilter.SUPPORTED_MEDIA_TYPE);
    for (org.springframework.http.MediaType supportedMediaType : org.restfulwhois.rdap.filters.httpFilter.HttpRequestFilter.SUPPORTED_MEDIA_TYPE) {
        for (org.springframework.http.MediaType mediaType : org.restfulwhois.rdap.filters.httpFilter.HttpRequestFilter.SUPPORTED_MEDIA_TYPE) {
            if ((org.apache.commons.lang.StringUtils.equalsIgnoreCase(supportedMediaType.getType(), mediaType.getType())) && (org.apache.commons.lang.StringUtils.equalsIgnoreCase(supportedMediaType.getSubtype(), mediaType.getSubtype()))) {
                return true;
            }
        }
    }
    return false;
}