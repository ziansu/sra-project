public void unbind() {
    org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    mPresenter.unsubscribe();
}