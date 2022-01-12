public static java.util.Optional<java.lang.Integer> findIssueWithId(java.util.List<backend.resource.TurboIssue> issues, int id) {
    int i = 0;
    for (backend.resource.TurboIssue issue : issues) {
        if ((issue.getId()) == id) {
            return java.util.Optional.of(i);
        }
        ++i;
    }
    return java.util.Optional.empty();
}