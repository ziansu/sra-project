public void move(int x, int y, final java.lang.Integer activityClass) {
    for (com.zst.xposed.halo.floatingwindow3.tasks.WindowHolder mWindowHolder : activitiesStack.get(activityClass)) {
        if (mWindowHolder != null) {
            mWindowHolder.position(x, y);
            mWindowHolder.pushToWindow();
        }
    }
}