private de.htwg.se.texasholdem.persistent.highscore.IHighscore copyHighscore(de.htwg.se.texasholdem.persistent.highscore.couchdb.PersistentHighscore phighscore) {
    if (phighscore == null) {
        return null;
    }
    de.htwg.se.texasholdem.persistent.highscore.IHighscore highscore = new de.htwg.se.texasholdem.persistent.highscore.Highscore();
    highscore.setId(phighscore.getId());
    highscore.setScore(phighscore.getScore());
    return highscore;
}