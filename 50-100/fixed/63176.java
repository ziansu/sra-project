private static void changeFocusApp(android.app.Activity a) {
    try {
        com.zst.xposed.halo.floatingwindow.hooks.ipc.XHFWInterface inf = com.zst.xposed.halo.floatingwindow.hooks.ipc.XHFWService.retrieveService(a);
        if (inf != null)
            inf.bringAppToFront(com.zst.xposed.halo.floatingwindow.hooks.MovableWindow.getActivityToken(a), a.getTaskId());
        
    } catch (android.os.RemoteException e) {
        e.printStackTrace();
    }
}