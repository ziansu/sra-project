public void addComponentAsNode(de.maibornwolff.codecharta.importer.sonar.model.Component component) {
    de.maibornwolff.codecharta.model.Node node = new de.maibornwolff.codecharta.model.Node(de.maibornwolff.codecharta.importer.sonar.SonarComponentProjectAdapter.createNodeName(component), createNodeTypeFromQualifier(component.getQualifier()), createAttributes(component.getMeasures()));
    de.maibornwolff.codecharta.nodeinserter.NodeInserter.insertByPath(this, createParentPath(component), node);
}