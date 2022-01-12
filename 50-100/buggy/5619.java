private java.util.List<de.be4.classicalb.core.parser.rules.PExpression> createIdentifierList(java.lang.String... strings) {
    java.util.ArrayList<de.be4.classicalb.core.parser.rules.PExpression> list = new java.util.ArrayList<>();
    for (int i = 0; i < (strings.length); i++) {
        list.add(de.be4.classicalb.core.parser.rules.RulesTransformation.createIdentifier(strings[i]));
    }
    return list;
}