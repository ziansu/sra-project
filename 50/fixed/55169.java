@java.lang.Override
public void signalPreExit() {
    if (((profilingWindow) != null) && (profilingWindow.isShowing())) {
        profilingWindow.dispose();
    }
}