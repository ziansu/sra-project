public static final java.lang.String createFilename(java.util.Date date, java.lang.String from, java.lang.String id, java.lang.String subject) {
    java.lang.String hash = com.fillumina.emailrecoverer.Hash.hashToString((from + id));
    return ((com.fillumina.emailrecoverer.DateExtractor.toCompactString(date)) + "_") + hash;
}