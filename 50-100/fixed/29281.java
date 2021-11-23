@java.lang.Override
protected void visit(java.lang.Object value, org.biopax.paxtools.model.BioPAXElement parent, org.biopax.paxtools.model.Model model, org.biopax.paxtools.controller.PropertyEditor editor) {
    if (value instanceof org.biopax.paxtools.model.BioPAXElement) {
        if ((value instanceof org.biopax.paxtools.model.level2.pathway) && (thing.getRDFId().equalsIgnoreCase(((org.biopax.paxtools.model.BioPAXElement) (value)).getRDFId()))) {
            error(thing, "cyclic.inclusion", getCurrentParentsList().toString());
        }
        traverse(((org.biopax.paxtools.model.BioPAXElement) (value)), model);
    }
}