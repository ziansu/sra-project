static void setDebuggerViewerLayout(boolean visible) {
    if ((com.atinternet.tracker.Debugger.debuggerViewerLayout) != null) {
        com.atinternet.tracker.Debugger.viewerVisibility = (visible) ? android.view.View.VISIBLE : android.view.View.GONE;
        com.atinternet.tracker.Debugger.debuggerViewerLayout.get().setVisibility(com.atinternet.tracker.Debugger.viewerVisibility);
        com.atinternet.tracker.Debugger.setAlphaBackground(visible, false);
    }
}