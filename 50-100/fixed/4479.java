@java.lang.Override
public boolean canTerminate() {
    synchronized(subLaunches) {
        if ((subLaunches.size()) == 0) {
            return false;
        }
        for (org.eclipse.debug.core.ILaunch launch : subLaunches.keySet()) {
            if (launch.canTerminate()) {
                return true;
            }
        }
        return false;
    }
}