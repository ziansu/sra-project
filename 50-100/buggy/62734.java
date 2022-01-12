public static java.util.List<org.kie.api.definition.process.Node> getStartNodes(org.kie.api.definition.process.Node[] nodes) {
    java.util.List<org.kie.api.definition.process.Node> startNodes = new java.util.ArrayList<org.kie.api.definition.process.Node>();
    for (int i = 0; i < (nodes.length); i++) {
        if ((nodes[i]) instanceof org.jbpm.workflow.core.node.StartNode) {
            startNodes.add(((org.jbpm.workflow.core.node.StartNode) (nodes[i])));
        }
    }
    return startNodes;
}