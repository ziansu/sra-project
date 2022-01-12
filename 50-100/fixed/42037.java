@java.lang.Override
public void run() {
    java.util.List<com.tobyrich.app.SmartPlane.api.model.Achievement> newAchievements = fetchAchievements();
    java.util.List<com.tobyrich.app.SmartPlane.api.model.Achievement> tmpAchievements = new java.util.ArrayList(newAchievements);
    newAchievements.removeAll(currentAchievements);
    if (!(newAchievements.isEmpty())) {
        currentAchievements = new java.util.ArrayList(tmpAchievements);
        de.greenrobot.event.EventBus.getDefault().post(new com.tobyrich.app.SmartPlane.dispatcher.event.AchievementUnlockedEvent(newAchievements));
    }
}