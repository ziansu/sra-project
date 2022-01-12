public java.lang.String toText() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("* Authors: ").append(contributions.size()).append("\n* Commits: ").append(commits.size());
    for (java.util.Map.Entry<java.lang.String, org.mockito.release.notes.vcs.Contribution> entry : org.mockito.release.notes.vcs.DefaultContributionSet.sortByValue(contributions)) {
        org.mockito.release.notes.vcs.Contribution c = entry.getValue();
        sb.append("\n  * ").append(c.toText());
    }
    return sb.toString();
}