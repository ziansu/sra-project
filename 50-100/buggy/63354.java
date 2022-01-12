private void runTaskResize() throws java.lang.Exception {
    final java.lang.String taskIdStr = nextArgRequired();
    final int taskId = java.lang.Integer.valueOf(taskIdStr);
    final android.graphics.Rect bounds = getBounds();
    if (bounds == null) {
        java.lang.System.err.println("Error: invalid input bounds");
        return ;
    }
    try {
        mAm.resizeTask(taskId, bounds);
    } catch (android.os.RemoteException e) {
    }
}