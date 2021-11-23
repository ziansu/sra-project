public java.lang.String getTargetString(java.util.HashSet<org.mcmonkey.sentinel.SentinelTarget> sentinel) {
    java.lang.StringBuilder targets = new java.lang.StringBuilder();
    for (org.mcmonkey.sentinel.SentinelTarget target : sentinel) {
        targets.append(target.name()).append(", ");
    }
    return (targets.length()) > 0 ? targets.substring(0, ((targets.length()) - 2)) : targets.toString();
}