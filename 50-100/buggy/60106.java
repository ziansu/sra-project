private void saveLostGameIfNecessary(android.view.View layout) {
    if (!(winGame)) {
        com.games.vishalanand23.bullsandcowsandroid.data.PlayResult lostGame = new com.games.vishalanand23.bullsandcowsandroid.data.PlayResult(androidId, numberOfDigits, originalValue, (-1), 0, java.lang.Integer.MAX_VALUE);
        dbStorageHelper.insertInDb(lostGame);
        serverRequestHelper.postRequest(lostGame);
    }
}