private de.htwg.se.texasholdem.persistent.highscore.couchdb.PersistentHighscore copyHighscore(de.htwg.se.texasholdem.persistent.highscore.IHighscore highscore) {
    if (highscore == null) {
        return null;
    }
    java.lang.String highscoreId = highscore.getId();
    de.htwg.se.texasholdem.persistent.highscore.couchdb.PersistentHighscore phighscore;
    if (containsHighscoreById(highscoreId)) {
        phighscore = db.find(de.htwg.se.texasholdem.persistent.highscore.couchdb.PersistentHighscore.class, highscoreId);
    }else {
        phighscore = new de.htwg.se.texasholdem.persistent.highscore.couchdb.PersistentHighscore();
    }
    phighscore.setId(highscore.getId());
    phighscore.setName(highscore.getName());
    phighscore.setScore(highscore.getScore());
    return phighscore;
}