private void runTaskLock() throws java.lang.Exception {
    java.lang.String taskIdStr = nextArgRequired();
    try {
        if (taskIdStr.equals("stop")) {
            mAm.stopLockTaskMode();
        }else {
            int taskId = java.lang.Integer.parseInt(taskIdStr);
            mAm.startLockTaskMode(taskId);
        }
        java.lang.System.err.println((("Activity manager is " + (mAm.isInLockTaskMode() ? "" : "not ")) + "in lockTaskMode"));
    } catch (android.os.RemoteException e) {
    }
}