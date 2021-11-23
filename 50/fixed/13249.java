@java.lang.Override
public void init(android.os.Bundle savedInstanceState) {
    setTargetRepository("ccrama");
    enableUserGitHubLogin();
    setExtraInfo(getIntent().getExtras().getString("stacktrace"));
    canEditDebugInfo();
}