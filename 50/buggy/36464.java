public java.lang.String transitionsToString() {
    return transitions.keySet().stream().map(( c) -> transitionToString(c)).collect(java.util.stream.Collectors.joining("\n"));
}