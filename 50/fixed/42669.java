public java.lang.String getAccessToken() {
    return ((java.lang.String) (io.cattle.platform.object.util.DataAccessor.fields(getAccountFromJWT()).withKey(GithubConstants.GITHUB_ACCESS_TOKEN).get()));
}