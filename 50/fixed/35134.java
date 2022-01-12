@at.rosinen.Noctis.AfterInject
public void afterInject() {
    de.greenrobot.event.EventBus.getDefault().register(this);
}