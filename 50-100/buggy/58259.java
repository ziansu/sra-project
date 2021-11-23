private static java.lang.String chainString(java.util.Set<org.codejargon.feather.Key> chain, org.codejargon.feather.Key lastKey) {
    java.util.List<org.codejargon.feather.Key> keys = new java.util.ArrayList(chain);
    keys.add(lastKey);
    java.lang.StringBuilder chainString = new java.lang.StringBuilder();
    for (org.codejargon.feather.Key key : keys) {
        chainString.append(" -> ").append(key.toString());
    }
    return chainString.toString();
}