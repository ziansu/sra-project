public static boolean getAchievementSuccessful(int index, com.quickbite.spaceslingshot.screens.GameScreen gameScreen) {
    return gameScreen.getData().getAchievementFlags()[index];
}