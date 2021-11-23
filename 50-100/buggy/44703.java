protected void updateAchievementFragment() {
    com.soctec.soctec.core.AchievementsFragment aF = ((com.soctec.soctec.core.AchievementsFragment) (mSectionsPagerAdapter.getFragment(2)));
    aF.refreshAchievements(unlocker.getUnlockableAchievements(), stats.getAchievements());
    aF.setPoints(stats.getPoints());
}