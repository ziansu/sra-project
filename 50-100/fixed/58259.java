private static java.lang.String chainString(java.util.Set<org.codejargon.feather.Key> chain, org.codejargon.feather.Key lastKey) {
    java.lang.StringBuilder chainString = new java.lang.StringBuilder();
    for (org.codejargon.feather.Key key : chain) {
        chainString.append(key.toString()).append(" -> ");
    }
    chainString.append(lastKey.toString());
    return chainString.toString();
}