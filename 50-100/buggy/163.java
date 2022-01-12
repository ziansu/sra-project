public static void checkTrophies(com.tann.hexcity.savaData.Trophy.AchievementType action, int arg) {
    java.lang.System.out.println(((("checking " + action) + " ") + arg));
    for (com.tann.hexcity.savaData.Trophy t : com.tann.hexcity.savaData.Trophy.achievementsList) {
        if (((t.requiredType) != null) && ((t.requiredType) != (com.tann.hexcity.screens.gameScreen.GameScreen.get().gameType)))
            continue;
        
        if ((t.type) != action)
            continue;
        
        if (arg >= (t.target))
            t.complete();
        
    }
}