private void callWalker(final de.rinderle.softvis3d.preprocessing.tree.PathWalker walker, final java.lang.String id, final java.lang.String path) {
    final de.rinderle.softvis3d.domain.sonar.SonarMeasure element = new de.rinderle.softvis3d.domain.sonar.SonarMeasure(id, id, path, java.util.Collections.emptyMap());
    walker.addPath(element);
}