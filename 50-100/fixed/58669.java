private int runResetPermissions() {
    try {
        mPm.resetRuntimePermissions();
        return 0;
    } catch (android.os.RemoteException e) {
        java.lang.System.err.println(e.toString());
        java.lang.System.err.println(com.android.commands.pm.Pm.PM_NOT_RUNNING_ERR);
        return 1;
    } catch (java.lang.IllegalArgumentException e) {
        java.lang.System.err.println(("Bad argument: " + (e.toString())));
        return com.android.commands.pm.Pm.showUsage();
    } catch (java.lang.SecurityException e) {
        java.lang.System.err.println(("Operation not allowed: " + (e.toString())));
        return 1;
    }
}