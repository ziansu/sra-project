private static com.facebook.presto.sql.tree.Statement parseStatement(com.facebook.presto.sql.parser.SqlParser parser, java.lang.String body) {
    java.util.List<java.lang.String> names = new java.util.ArrayList<>();
    com.facebook.presto.sql.tree.Statement result = parser.createStatement(org.qcert.sql.PrestoEncoder.applyLexicalFixups(body, names));
    if (!(names.isEmpty()))
        result = org.qcert.sql.PrestoEncoder.distributeNames(((com.facebook.presto.sql.tree.CreateView) (result)), names);
    
    return result;
}