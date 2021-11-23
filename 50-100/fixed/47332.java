public org.maximachess.jdrone.learn.LBMove lookup(org.maximachess.chess.Game g) {
    org.maximachess.chess.Board b = g.getCurrentPosition();
    java.lang.String key = getKey(b, g.getVariant());
    org.maximachess.jdrone.learn.LBEntry entry = getBook().getEntry(key);
    if (entry == null) {
        return null;
    }
    org.maximachess.jdrone.learn.LearnBook.LOGGER.info(("lookup " + key));
    this.game = g;
    return pick(g, entry);
}