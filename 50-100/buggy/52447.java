private void launchTerminated(org.eclipse.debug.core.ILaunch launch) {
    if ((this) == launch) {
        return ;
    }
    if ((subLaunches.remove(launch)) != null) {
        if (((subLaunches.size()) == 0) && (fLaunched)) {
            fTerminated = true;
            fireTerminate();
        }
    }
}