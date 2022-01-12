@java.lang.Override
public org.eclipse.titan.designer.AST.Location getLocation() {
    if ((fieldId) != null) {
        return new org.eclipse.titan.designer.AST.Location(fieldId.getLocation());
    }else {
        return null;
    }
}