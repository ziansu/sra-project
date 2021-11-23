@java.lang.Override
public void visitEnumValue(net.ssehub.easy.varModel.model.values.EnumValue value) {
    java.lang.Enum copiedType = ((java.lang.Enum) (copyier.getTranslatedType(value.getContainedType())));
    if (null != copiedType) {
        net.ssehub.easy.varModel.model.datatypes.EnumLiteral lit = copiedType.get(value.getValue().getName());
        try {
            result = net.ssehub.easy.varModel.model.values.ValueFactory.createValue(copiedType, lit);
        } catch (net.ssehub.easy.varModel.model.values.ValueDoesNotMatchTypeException e) {
            result = value;
            complete = false;
        }
    }else {
        result = value;
        complete = false;
    }
}