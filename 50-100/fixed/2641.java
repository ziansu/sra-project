protected java.util.Optional<org.nest.codegeneration.helpers.LEMSElements.Unit> handleType(org.nest.symboltable.symbols.TypeSymbol _typeSymbol) {
    com.google.common.base.Preconditions.checkNotNull(_typeSymbol);
    if ((_typeSymbol.getType()) == (TypeSymbol.Type.UNIT)) {
        org.nest.codegeneration.helpers.LEMSElements.Unit temp = new org.nest.codegeneration.helpers.LEMSElements.Unit(_typeSymbol);
        this.addDimension(temp.getDimension());
        this.addUnit(temp);
        return java.util.Optional.of(temp);
    }
    return java.util.Optional.empty();
}