boolean isConstant(java.lang.String identifier) {
    return (this.localIdentifiers.getTypeDescriptor(identifier)) instanceof cz.cuni.mff.d3s.trupple.language.parser.ConstantDescriptor;
}