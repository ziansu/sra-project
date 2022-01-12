public void newScore() {
    currentScore = new org.osumercury.controlcenter.Score();
    int i = 0;
    for (java.lang.String key : org.osumercury.controlcenter.Config.getKeysInOriginalOrder("fields")) {
        scores[i] = org.osumercury.controlcenter.Score.getDefaultValue(key);
        currentScore.setValue(key, org.osumercury.controlcenter.Score.getDefaultValue(key));
        i++;
    }
}