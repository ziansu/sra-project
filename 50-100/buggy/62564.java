void dismissTask(long delayed) {
    final com.android.systemui.recents.views.TaskView tv = this;
    startDeleteTaskAnimation(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if ((mCb) != null) {
                mCb.onTaskViewDismissed(tv);
            }
        }
    }, delayed);
    animateFooterVisibility(false, mConfig.taskViewRemoveAnimDuration);
}