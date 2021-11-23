public void lastFmLogIn(java.lang.String username, java.lang.String password) {
    lastFmPreferences.setLastFmUsername(username);
    lastFmPreferences.setLasFmPassword(password);
    lastFmTask = new com.transgressoft.musicott.services.LastFmTask(this);
    lastFmTask.start();
}