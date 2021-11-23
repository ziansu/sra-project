@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
protected java.util.List<org.pm4j.core.pm.PmObject> getPmChildNodes(org.pm4j.core.pm.impl.PmObjectBase pm) {
    org.pm4j.core.pm.impl.PmElementBase pe = ((org.pm4j.core.pm.impl.PmElementBase) (pm));
    if ((pe.pmChildNodes) == null) {
        pe.pmChildNodes = ((java.util.List<org.pm4j.core.pm.PmObject>) (pe.getPmChildNodesImpl()));
    }
    return pe.pmChildNodes;
}