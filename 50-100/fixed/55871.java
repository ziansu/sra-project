private void parsePom(aQute.maven.provider.POM pom, java.lang.String parent) throws java.lang.Exception {
    java.util.Map<aQute.maven.api.Program, aQute.maven.api.IPom.Dependency> dependencies = pom.getDependencies(java.util.EnumSet.of(MavenScope.compile, MavenScope.runtime), false);
    for (aQute.maven.api.IPom.Dependency d : dependencies.values()) {
        parse(d.getArchive(), parent);
    }
}