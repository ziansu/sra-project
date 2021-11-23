@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public boolean support(@javax.annotation.Nonnull
hudson.model.Item item) {
    if (isItemUsingGithubScm(item)) {
        java.lang.String apiUrl = getApiUrl(item);
        if ((apiUrl == null) || (apiUrl.startsWith(GitHubSCMSource.GITHUB_URL))) {
            return true;
        }
    }
    return false;
}