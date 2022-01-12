public java.lang.String getTargetString(java.util.HashSet<java.lang.String> sentinel) {
    java.lang.StringBuilder targets = new java.lang.StringBuilder();
    for (java.lang.String target : sentinel) {
        targets.append(target).append(", ");
    }
    return (targets.length()) > 0 ? targets.substring(0, ((targets.length()) - 2)) : targets.toString();
}