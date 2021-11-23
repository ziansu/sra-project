synchronized void like(java.lang.String word, java.lang.String web) throws java.sql.SQLException {
    java.lang.String sql = ((((("update wordlist set wordlist." + web) + "=wordlist.") + web) + "+1 where wordlist.word=") + word) + ";";
    stmt.executeQuery(sql);
}