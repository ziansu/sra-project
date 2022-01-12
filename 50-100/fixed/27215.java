private java.util.Set<java.lang.String> getDeadlinesFromArgs(java.lang.String deadlineArguments) {
    if (deadlineArguments.isEmpty()) {
        return java.util.Collections.emptySet();
    }
    final java.util.Collection<java.lang.String> deadlineStrings = java.util.Arrays.asList(deadlineArguments.replaceFirst(" d/", "").trim().split(" t/"));
    return new java.util.HashSet<>(deadlineStrings);
}