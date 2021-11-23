private org.eclipse.egit.github.core.client.GitHubRequest applyClientIdAndSecret(org.eclipse.egit.github.core.client.GitHubRequest request) {
    java.util.Map<java.lang.String, java.lang.String> params = new java.util.HashMap<java.lang.String, java.lang.String>(request.getParams());
    params.put("client_id", clientId);
    params.put("client_secret", clientSecret);
    request.setParams(params);
    return request;
}