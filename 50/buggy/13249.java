@java.lang.Override
public void init(android.os.Bundle savedInstanceState) {
    setTargetRepository("ccrama");
    setGuestOAuth2Token(SecretConstants.GithubBotRepo);
    enableUserGitHubLogin();
    setExtraInfo(getIntent().getExtras().getString("stacktrace"));
    canEditDebugInfo();
}