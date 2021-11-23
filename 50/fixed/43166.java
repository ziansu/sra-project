private java.util.List<Argument> getAllSupporters() {
    return children.stream().filter(Argument::isSupporter).collect(java.util.stream.Collectors.toList());
}