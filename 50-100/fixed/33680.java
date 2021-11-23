public java.lang.String toText() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("* Authors: ").append(contributions.size()).append("\n* Commits: ").append(commits.size());
    java.util.Collections.sort(contributions);
    for (org.mockito.release.notes.vcs.Contribution c : contributions) {
        sb.append("\n  * ").append(c.toText());
    }
    return sb.toString();
}