private void parsePom(aQute.maven.provider.POM pom, java.lang.String parent) throws java.lang.Exception {
    java.util.Map<aQute.maven.api.Program, aQute.maven.api.IPom.Dependency> dependencies = pom.getDependencies(java.util.EnumSet.of(MavenScope.compile, MavenScope.runtime), false);
    if ((aQute.bnd.repository.maven.pom.provider.Traverser.ROOT.equals(parent)) && (dependencies.isEmpty())) {
        finish();
        return ;
    }
    for (aQute.maven.api.IPom.Dependency d : dependencies.values()) {
        parse(d.getArchive(), parent);
    }
}