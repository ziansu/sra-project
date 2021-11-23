@java.lang.Override
public java.util.List<org.semanticweb.owlapi.model.OWLObject> getAdjacent(org.semanticweb.owlapi.model.OWLObject source) {
    java.util.Set<org.semanticweb.owlapi.model.OWLObject> ancestors = graph.getAncestors(source);
    if ((ancestors == null) || (ancestors.isEmpty())) {
        return java.util.Collections.emptyList();
    }
    java.util.List<org.semanticweb.owlapi.model.OWLObject> list = new java.util.ArrayList<org.semanticweb.owlapi.model.OWLObject>(ancestors.size());
    for (org.semanticweb.owlapi.model.OWLObject obj : ancestors) {
        if (obj != null) {
            list.add(obj);
        }
    }
    return list;
}