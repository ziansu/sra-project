public static java.util.Optional<java.lang.Integer> findIssueWithId(java.util.List<backend.resource.TurboIssue> issues, int id) {
    for (int i = 0; i < (issues.size()); i++) {
        if ((issues.get(i).getId()) == id) {
            return java.util.Optional.of(i);
        }
    }
    return java.util.Optional.empty();
}