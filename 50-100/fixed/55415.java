@java.lang.Override
public void getField(org.teavm.dependency.VariableReader receiver, org.teavm.dependency.VariableReader instance, org.teavm.dependency.FieldReference field, org.teavm.dependency.ValueType fieldType) {
    org.teavm.dependency.FieldDependency fieldDep = dependencyChecker.linkField(field, new org.teavm.dependency.CallLocation(caller.getMethod(), currentLocation));
    if (!(fieldType instanceof org.teavm.dependency.ValueType.Primitive)) {
        org.teavm.dependency.DependencyNode receiverNode = nodes[receiver.getIndex()];
        if (receiverNode != null) {
            fieldDep.getValue().connect(receiverNode);
        }
    }
    initClass(field.getClassName());
}