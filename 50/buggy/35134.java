@at.rosinen.Noctis.AfterInject
public void afterInject() {
    de.greenrobot.event.EventBus.getDefault().register(this);
    de.greenrobot.event.EventBus.getDefault().post(new at.rosinen.Noctis.events.FragmentChangeEvent(new at.rosinen.Noctis.LoginFragement_(), false));
}