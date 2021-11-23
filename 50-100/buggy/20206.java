public void showSubject(at.jku.ce.CoMPArE.visualize.Subject subject) {
    graph = new com.vaadin.pontus.vizcomponent.model.Graph(name, com.vaadin.pontus.vizcomponent.model.Graph.DIGRAPH);
    if ((subject.getFirstState()) != null)
        addState(null, null, subject.getFirstState(), subject.getStates());
    
    component.drawGraph(graph);
    component.fitGraph();
}