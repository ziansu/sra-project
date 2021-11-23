private boolean isNewHighScore(java.lang.String lastScoreDeck) {
    java.lang.String highScoreDeck = prefs.getString("highScoreDeck", "");
    if ((lastScoreDeck.isEmpty()) || ((lastScoreDeck.compareTo(highScoreDeck)) < 0)) {
        return true;
    }else {
        return false;
    }
}