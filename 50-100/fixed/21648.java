private static synchronized void markAsCode(java.io.File file, int line) {
    java.util.List<java.lang.Integer> coverageInfo = ru.urururu.util.Coverage.coverage.computeIfAbsent(file, ( __) -> new java.util.ArrayList<>());
    while ((coverageInfo.size()) < (line + 1)) {
        coverageInfo.add(null);
    } 
    java.lang.Integer oldInfo = coverageInfo.get(line);
    coverageInfo.set(line, (oldInfo == null ? 0 : oldInfo));
}