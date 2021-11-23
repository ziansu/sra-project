protected org.eclipse.egit.github.core.client.PagedRequest<T> createUpdatedRequest(org.eclipse.egit.github.core.IRepositoryIdProvider repoId) {
    org.eclipse.egit.github.core.client.PagedRequest<T> request = new org.eclipse.egit.github.core.client.PagedRequest();
    java.lang.String path = (((org.eclipse.egit.github.core.client.IGitHubConstants.SEGMENT_REPOS) + "/") + (repoId.generateId())) + (apiSuffix);
    request.setUri(path);
    request.setResponseContentType(org.eclipse.egit.github.core.client.IGitHubConstants.CONTENT_TYPE_JSON);
    return request;
}