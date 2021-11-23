@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == null) {
        return false;
    }
    if (!(obj instanceof liquibase.diff.output.changelog.DiffToChangeLog.DependencyGraph.Edge)) {
        return false;
    }
    liquibase.diff.output.changelog.DiffToChangeLog.DependencyGraph.Edge e = ((liquibase.diff.output.changelog.DiffToChangeLog.DependencyGraph.Edge) (obj));
    return ((e.from) == (from)) && ((e.to) == (to));
}