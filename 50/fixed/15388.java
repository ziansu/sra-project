protected org.springframework.http.MediaType getMediaType(javax.servlet.http.HttpServletRequest request, org.springframework.core.io.Resource resource) {
    return this.pathExtensionStrategy.getMediaTypeForResource(resource);
}