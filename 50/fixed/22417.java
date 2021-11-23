@com.oracle.truffle.api.dsl.Specialization
protected boolean equals(cz.cuni.mff.d3s.trupple.language.customvalues.EnumValue left, cz.cuni.mff.d3s.trupple.language.customvalues.EnumValue right) {
    return left.getValue().equals(right.getValue());
}