private void printTree(java.lang.String s) {
    com.orientechnologies.orient.core.sql.parser.OrientSql osql = getParserFor(s);
    try {
        com.orientechnologies.orient.core.sql.parser.SimpleNode result = osql.parse();
    } catch (com.orientechnologies.orient.core.sql.parser.ParseException e) {
        e.printStackTrace();
    }
}