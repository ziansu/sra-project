public static org.gitlab4j.api.GitLabApi login(org.gitlab4j.api.GitLabApi.ApiVersion apiVersion, java.lang.String url, java.lang.String username, java.lang.String password) throws org.gitlab4j.api.GitLabApiException {
    org.gitlab4j.api.SessionApi sessionApi = new org.gitlab4j.api.SessionApi(new org.gitlab4j.api.GitLabApi(apiVersion, url, ((java.lang.String) (null))));
    org.gitlab4j.api.models.Session session = sessionApi.login(username, null, password);
    return new org.gitlab4j.api.GitLabApi(url, session);
}