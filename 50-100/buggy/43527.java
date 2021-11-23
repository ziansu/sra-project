public static org.eclipse.bpmn2.di.BPMNEdge findBPMNEdge(org.eclipse.bpmn2.di.BPMNDiagram bpmnDiagram, org.eclipse.bpmn2.BaseElement baseElement) {
    for (org.eclipse.dd.di.DiagramElement de : bpmnDiagram.getPlane().getPlaneElement()) {
        if (de instanceof org.eclipse.bpmn2.di.BPMNEdge) {
            org.eclipse.bpmn2.BaseElement ele = ((org.eclipse.bpmn2.di.BPMNEdge) (de)).getBpmnElement();
            if (ele == baseElement)
                return ((org.eclipse.bpmn2.di.BPMNEdge) (de));
            
        }
    }
    return null;
}