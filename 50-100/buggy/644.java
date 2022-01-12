private java.util.Optional<org.nest.codegeneration.helpers.LEMSElements.Unit> handleType(org.nest.units._ast.ASTDatatype _dataType) {
    com.google.common.base.Preconditions.checkNotNull(_dataType);
    if (_dataType.getUnitType().isPresent()) {
        org.nest.codegeneration.helpers.LEMSElements.Unit temp = new org.nest.codegeneration.helpers.LEMSElements.Unit(_dataType.getUnitType().get());
        this.addDimension(temp.getDimension());
        this.addUnit(temp);
        return java.util.Optional.of(temp);
    }
    return java.util.Optional.empty();
}