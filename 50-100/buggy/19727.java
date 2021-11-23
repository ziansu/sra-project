@java.lang.Override
protected void onStart() {
    startAudioService();
    loadSettings();
    registerReceivers();
    super.onStart();
    if (!(org.greenrobot.eventbus.EventBus.getDefault().isRegistered(this)))
        org.greenrobot.eventbus.EventBus.getDefault().register(this);
    
}