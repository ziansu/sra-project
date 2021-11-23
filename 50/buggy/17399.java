@java.lang.Override
protected void onResume() {
    super.onResume();
    updateControlsStatus(new com.ciplogic.allelon.eventbus.events.UnknownMediaPlayerStatusEvent());
    updatePlayedTitleStatus(new com.ciplogic.allelon.eventbus.events.UnknownMediaPlayerTitleEvent());
    EventBus.INSTANCE.fire(new com.ciplogic.allelon.eventbus.events.RequestMediaPlayerStatusEvent());
}