@java.lang.Override
public void onInterrupt() {
    if ((stopped) || (!(isEnabled()))) {
        setStatusEmpty();
    }else {
        setStatusWorking();
    }
}