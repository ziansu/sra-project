public static java.lang.String databasePrerequistes(java.util.List<java.lang.String> prereqs) {
    java.lang.StringBuilder dbPrereqs = new java.lang.StringBuilder();
    for (java.lang.String item : prereqs) {
        dbPrereqs.append(item).append(",");
    }
    if ((dbPrereqs.length()) > 0) {
        dbPrereqs.deleteCharAt(((dbPrereqs.length()) - 1));
    }
    return dbPrereqs.toString();
}