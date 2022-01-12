@java.lang.Override
public boolean isTerminated() {
    if (fTerminated) {
        return true;
    }
    if ((subLaunches.size()) == 0) {
        return fLaunched;
    }
    for (org.eclipse.debug.core.ILaunch launch : subLaunches.keySet()) {
        if (!(launch.isTerminated())) {
            return false;
        }
    }
    return fLaunched;
}