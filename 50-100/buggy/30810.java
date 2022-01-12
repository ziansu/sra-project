private void runStackResize() throws java.lang.Exception {
    java.lang.String stackIdStr = nextArgRequired();
    int stackId = java.lang.Integer.valueOf(stackIdStr);
    final android.graphics.Rect bounds = getBounds();
    if (bounds == null) {
        java.lang.System.err.println("Error: invalid input bounds");
        return ;
    }
    try {
        mAm.resizeStack(stackId, bounds);
    } catch (android.os.RemoteException e) {
    }
}