private boolean processCheck() {
    int myPid = android.os.Process.myPid();
    android.app.ActivityManager am = ((android.app.ActivityManager) (this.getSystemService(com.smartdevicelink.transport.ACTIVITY_SERVICE)));
    for (android.app.ActivityManager.RunningAppProcessInfo processInfo : am.getRunningAppProcesses()) {
        if ((processInfo.pid) == myPid) {
            return com.smartdevicelink.transport.SdlRouterService.ROUTER_SERVICE_PROCESS.equals(processInfo.processName);
        }
    }
    return false;
}