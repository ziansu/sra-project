private se.de.hu_berlin.informatik.astlmbuilder.parsing.VariableInfoWrapper buildVarInfoWrapper(com.github.javaparser.ast.Node aNode, java.lang.String aType, java.lang.String aName, java.lang.String aLastKnownValue) {
    boolean primitive = false;
    se.de.hu_berlin.informatik.astlmbuilder.parsing.VariableInfoWrapper.VariableScope scope = se.de.hu_berlin.informatik.astlmbuilder.parsing.VariableInfoWrapper.VariableScope.UNKNOWN;
    primitive = hasPrimitiveType(aType);
    scope = getScope(aNode);
    return new se.de.hu_berlin.informatik.astlmbuilder.parsing.VariableInfoWrapper(aType, aName, aLastKnownValue, primitive, scope, aNode);
}