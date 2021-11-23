public static void init(boolean enableWhispersync) {
    try {
        com.gcex.GameCircle.enableWhispersync = enableWhispersync;
        if (enableWhispersync) {
            com.gcex.GameCircle.gameFeatures = java.util.EnumSet.of(AmazonGamesFeature.Achievements, AmazonGamesFeature.Leaderboards, AmazonGamesFeature.Whispersync);
        }else {
            com.gcex.GameCircle.gameFeatures = java.util.EnumSet.of(AmazonGamesFeature.Achievements, AmazonGamesFeature.Leaderboards);
        }
        com.gcex.GameCircle.resume();
    } catch (java.lang.Exception e) {
        android.util.Log.i(com.gcex.GameCircle.TAG, "GameCircle: init Exception");
        android.util.Log.i(com.gcex.GameCircle.TAG, e.toString());
        return ;
    }
}