public boolean matches(org.jacoco.core.analysis.ICoverageNode n) {
    return getName().matches(jacoco.report.internal.html.parse.NameCreator.create(n));
}