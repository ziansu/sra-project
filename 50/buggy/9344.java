public boolean updateAchievement(C change, android.content.Context context) {
    boolean wasUnlocked = isUnlocked();
    updater.updateAchievement(this, change, context);
    return (!wasUnlocked) && (isUnlocked());
}