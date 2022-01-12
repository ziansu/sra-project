public void showContent() {
    if ((onProgressLintener) != null) {
        onProgressLintener.onStopProgressing();
    }
    switchState(com.pinocc.progress.ProgressLayout.State.CONTENT, null, java.util.Collections.<java.lang.Integer>emptyList());
}