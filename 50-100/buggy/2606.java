public simpledb.parse.CreateIndexData createIndex() {
    lex.eatKeyword("create");
    java.lang.String indexType = lex.eatId();
    lex.eatKeyword("index");
    java.lang.String idxname = lex.eatId();
    lex.eatKeyword("on");
    java.lang.String tblname = lex.eatId();
    lex.eatDelim('(');
    java.lang.String fldname = field();
    lex.eatDelim(')');
    return new simpledb.parse.CreateIndexData(indexType, idxname, tblname, fldname);
}