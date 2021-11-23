private <T> void addNodeListNodes(org.netbeans.spi.project.ui.support.NodeList<T> nodeList, java.util.List<org.netbeans.gradle.project.api.nodes.SingleNodeFactory> toPopulate) {
    for (T key : nodeList.keys()) {
        toPopulate.add(new org.netbeans.gradle.project.view.AnnotationChildNodes.NodeListNodeFactory(nodeList, key));
    }
}