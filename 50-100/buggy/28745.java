@java.lang.Override
public void onEventCreated(com.destiny.event.scheduler.models.GameModel game) {
    openMainActivity(null);
    allGameList.add(game);
    scheduledGameList.add(game);
    if ((scheduledEventsListener) != null) {
        scheduledEventsListener.onGamesLoaded(scheduledGameList);
    }
    viewPager.setCurrentItem(1);
    setAlarmNotification(game);
}