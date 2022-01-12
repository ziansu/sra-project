@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj) {
        return true;
    }
    if ((obj != null) && ((getClass()) == (obj.getClass()))) {
        org.neo4j.kernel.api.EntityPropertyDescriptor that = ((org.neo4j.kernel.api.EntityPropertyDescriptor) (obj));
        return ((this.entityId) == (that.entityId)) && ((this.propertyKeyId) == (that.propertyKeyId));
    }
    return false;
}