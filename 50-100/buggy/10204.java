public boolean isUserNewRecord(java.lang.String username, int score) {
    for (int record = 0; record < (this.highscores.size()); record++) {
        CK.FileIO.Highscore.Highscore scoreNow = this.highscores.get(record);
        if (((scoreNow.getUsername()) == username) && ((scoreNow.getScore()) < score)) {
            java.lang.System.out.println("User new highscore");
            return true;
        }else {
            return false;
        }
    }
    return false;
}