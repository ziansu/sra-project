public boolean isUserNewRecord(java.lang.String username, int score) {
    for (int record = 0; record < (this.highscores.size()); record++) {
        CK.FileIO.Highscore.Highscore scoreNow = this.highscores.get(record);
        if ((scoreNow.getUsername().equals(username)) && ((scoreNow.getScore()) < score)) {
            return true;
        }
    }
    return false;
}