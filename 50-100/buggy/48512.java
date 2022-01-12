public java.util.List<se.racemates.maven.FileInfo> sortDependencies() {
    final java.util.List<se.racemates.maven.FileInfo> result = new java.util.ArrayList<>();
    final java.util.Optional<java.lang.String> first = map.keySet().stream().findFirst();
    if (first.isPresent()) {
        checkDependencies(first.get());
        index.forEach(( key) -> {
            result.add(map.get(key));
        });
    }
    return result;
}