public void refreshFinished() {
    status = com.houskii.simplerecyclerview.SimpleRecyclerView.RefreshStatus.UNDO;
    valueAnimator.end();
    onRefreshingListener.onFinish();
}