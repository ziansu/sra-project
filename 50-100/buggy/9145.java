private boolean match(java.util.Map<java.lang.Integer, org.naturn.java8.pattern.PatternDemo.Node> nodes, java.util.List<java.lang.String[]> orgs) {
    boolean result = false;
    for (java.lang.String[] org : orgs) {
        result = match(nodes, org);
    }
    return result;
}