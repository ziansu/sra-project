@java.lang.Override
public void onEventCreated(com.destiny.event.scheduler.models.GameModel game) {
    openMainActivity(null);
    if ((allGameList) == null)
        allGameList = new java.util.ArrayList<>();
    
    allGameList.add(game);
    if ((scheduledGameList) == null)
        scheduledGameList = new java.util.ArrayList<>();
    
    scheduledGameList.add(game);
    if ((scheduledEventsListener) != null) {
        scheduledEventsListener.onGamesLoaded(scheduledGameList);
    }
    viewPager.setCurrentItem(1);
    setAlarmNotification(game);
}