@java.lang.Override
public void onStart() {
    super.onStart();
    org.greenrobot.eventbus.EventBus.getDefault().register(this);
}