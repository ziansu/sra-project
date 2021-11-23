public static java.util.List<com.ibm.research.sparql.rewriter.RuleforJena> parseRules(java.lang.String rulesString) {
    java.lang.String[] rules = rulesString.split("###");
    java.util.List<com.ibm.research.sparql.rewriter.RuleforJena> result = new java.util.LinkedList<com.ibm.research.sparql.rewriter.RuleforJena>();
    for (java.lang.String rule : rules) {
        com.hp.hpl.jena.query.Query query = com.ibm.rdf.store.testSuite.SPINRulesTest.parseToJenaQuery(rule);
        com.ibm.research.sparql.rewriter.RuleforJena r = new com.ibm.research.sparql.rewriter.RuleforJena(query);
        result.add(r);
    }
    return result;
}