@java.lang.Override
public void putField(org.teavm.dependency.VariableReader instance, org.teavm.dependency.FieldReference field, org.teavm.dependency.VariableReader value, org.teavm.dependency.ValueType fieldType) {
    if (!(fieldType instanceof org.teavm.dependency.ValueType.Primitive)) {
        org.teavm.dependency.FieldDependency fieldDep = dependencyChecker.linkField(field, new org.teavm.dependency.CallLocation(caller.getMethod(), currentLocation));
        org.teavm.dependency.DependencyNode valueNode = nodes[value.getIndex()];
        if (valueNode != null) {
            valueNode.connect(fieldDep.getValue());
        }
    }
    initClass(field.getClassName());
}