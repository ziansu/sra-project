@java.lang.Override
public boolean onResultAnalyzed() {
    com.squareup.leakcanary.assistivetouch.AssistiveGuardService.LoadLeaks.load(this);
    return false;
}