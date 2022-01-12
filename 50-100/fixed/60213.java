private static java.lang.String containsAtomIntoCypherQuery(fr.lirmm.graphik.graal.api.core.Atom a, boolean checkVariableAsFixed) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("MATCH ");
    fr.lirmm.graphik.graal.store.gdb.Neo4jStore.atomToCypher(sb, a, checkVariableAsFixed, false);
    sb.append("RETURN atom");
    return sb.toString();
}