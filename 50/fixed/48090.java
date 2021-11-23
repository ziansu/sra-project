public void refreshFinished() {
    if ((onRefreshingListener) == null) {
        return ;
    }
    status = com.houskii.simplerecyclerview.SimpleRecyclerView.RefreshStatus.UNDO;
    valueAnimator.end();
    onRefreshingListener.onFinish();
}