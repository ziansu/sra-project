public static java.util.List<org.kie.api.definition.process.Node> getStartNodes(org.kie.api.definition.process.Node[] nodes) {
    java.util.List<org.kie.api.definition.process.Node> startNodes = new java.util.ArrayList<org.kie.api.definition.process.Node>();
    for (org.kie.api.definition.process.Node node : nodes) {
        if (node instanceof org.jbpm.workflow.core.node.StartNode) {
            startNodes.add(node);
        }
    }
    return startNodes;
}