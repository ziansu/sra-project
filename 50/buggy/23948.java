@java.lang.Override
public void onServiceReady(com.amazon.ags.api.AmazonGamesClient amazonGamesClient) {
    com.gcex.GameCircle.agsClient = amazonGamesClient;
    android.util.Log.i(com.gcex.GameCircle.TAG, "GameCircle: initialize Successful");
    if (com.gcex.GameCircle.enableWhispersync) {
        com.gcex.GameCircle.gameDataMap = com.amazon.ags.api.AmazonGamesClient.getWhispersyncClient().getGameData();
    }
}