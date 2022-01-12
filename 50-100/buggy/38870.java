private java.util.List<java.lang.String> filterByName(java.util.List<java.lang.String> repoLabels, java.lang.String labelName) {
    return repoLabels.stream().filter(( name) -> util.Utility.containsIgnoreCase(getGroup(name), labelName)).collect(java.util.stream.Collectors.toList());
}