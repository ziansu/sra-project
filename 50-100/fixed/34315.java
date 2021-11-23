public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    if ((properties.length) > 0) {
        for (java.lang.String n : properties) {
            sb.append(("$." + n));
            if ((direction) == (org.neo4j.ogm.cypher.query.SortOrder.Direction.DESC)) {
                sb.append(" DESC");
            }
            sb.append(",");
        }
        sb.deleteCharAt(((sb.length()) - 1));
    }
    return sb.toString();
}