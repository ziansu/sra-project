@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj) {
        return true;
    }
    if ((obj != null) && (obj instanceof org.neo4j.kernel.api.NodeMultiPropertyDescriptor)) {
        org.neo4j.kernel.api.NodeMultiPropertyDescriptor that = ((org.neo4j.kernel.api.NodeMultiPropertyDescriptor) (obj));
        return ((this.getLabelId()) == (that.getLabelId())) && (java.util.Arrays.equals(this.propertyKeyIds, that.propertyKeyIds));
    }
    return false;
}