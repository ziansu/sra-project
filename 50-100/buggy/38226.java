public java.util.HashMap<java.lang.String, java.lang.String> buildAliasTruePair(net.sf.jsqlparser.statement.select.PlainSelect selectBody) {
    java.util.HashMap<java.lang.String, java.lang.String> AliasTruePair = new java.util.HashMap<java.lang.String, java.lang.String>();
    java.lang.String table = selectBody.getFromItem().toString();
    addPair(AliasTruePair, table);
    java.util.List<net.sf.jsqlparser.statement.select.Join> joinPairs = selectBody.getJoins();
    for (net.sf.jsqlparser.statement.select.Join singleJoin : joinPairs) {
        table = singleJoin.toString();
        addPair(AliasTruePair, table);
    }
    return AliasTruePair;
}