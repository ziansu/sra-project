public java.util.List<se.racemates.maven.FileInfo> sortDependencies() {
    final java.util.List<se.racemates.maven.FileInfo> result = new java.util.ArrayList<>();
    map.keySet().forEach(this::checkDependencies);
    index.forEach(( key) -> {
        result.add(map.get(key));
    });
    return result;
}