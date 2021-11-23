@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.ciplogic.allelon.eventbus.ObjectInstantiator.ensureInstantiated(this);
    com.ciplogic.allelon.PlayActivity.INSTANCE = this;
    setContentView(R.layout.play_activity);
    findUiComponents();
    addEventListeners();
    updateControlsStatus(new com.ciplogic.allelon.eventbus.events.UnknownMediaPlayerStatusEvent());
    updatePlayedTitleStatus(new com.ciplogic.allelon.eventbus.events.UnknownMediaPlayerTitleEvent());
    EventBus.INSTANCE.registerListener(this);
    EventBus.INSTANCE.fire(new com.ciplogic.allelon.eventbus.events.RequestMediaPlayerStatusEvent());
}