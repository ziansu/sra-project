public org.processmining.models.semantics.petrinet.Marking[] getFinalMarkingAsArray() throws javassist.tools.rmi.ObjectNotFoundException {
    java.util.List<org.processmining.models.semantics.petrinet.Marking> fM = new java.util.ArrayList<org.processmining.models.semantics.petrinet.Marking>();
    if ((finalMarking.size()) > 0) {
        for (org.processmining.models.graphbased.directed.petrinet.elements.Place place : finalMarking) {
            org.processmining.models.semantics.petrinet.Marking m = new org.processmining.models.semantics.petrinet.Marking();
            m.add(place);
            fM.add(m);
        }
        return fM.toArray(new org.processmining.models.semantics.petrinet.Marking[finalMarking.size()]);
    }else
        return new org.processmining.models.semantics.petrinet.Marking[]{ new org.processmining.models.semantics.petrinet.Marking() };
    
}