private org.processmining.models.graphbased.directed.bpmn.BPMNNode getNodeinClone(org.processmining.models.graphbased.directed.bpmn.BPMNDiagram bpmn, org.processmining.models.graphbased.directed.bpmn.BPMNNode node) {
    for (org.processmining.models.graphbased.directed.bpmn.BPMNNode nodeclone : bpmn.getNodes()) {
        if ((nodeclone.getLabel()) != null)
            if (nodeclone.getLabel().equals(node.getLabel())) {
                return nodeclone;
            }
        
    }
    return null;
}