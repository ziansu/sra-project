private void init() {
    if (!(org.greenrobot.eventbus.EventBus.getDefault().isRegistered(this))) {
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
    }
}