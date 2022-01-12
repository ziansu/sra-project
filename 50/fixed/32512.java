@java.lang.Override
public void visitClassType(java.lang.String type) {
    type = type.replace('/', '.');
    insideGeneric.add(type);
}