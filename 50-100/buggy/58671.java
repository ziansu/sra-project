public static java.util.List<java.util.Map<java.lang.String, spoon.reflect.declaration.CtVariable>> findAllVarMappingCombination(java.util.Map<fr.inria.astor.core.manipulation.sourcecode.VarWrapper, java.util.List<spoon.reflect.declaration.CtVariable>> mappedVars) {
    java.util.List<java.util.Map<java.lang.String, spoon.reflect.declaration.CtVariable>> allCombinationsOne = new java.util.ArrayList<>();
    java.util.List<fr.inria.astor.core.manipulation.sourcecode.VarWrapper> varNamesOne = new java.util.ArrayList(mappedVars.keySet());
    fr.inria.astor.core.manipulation.sourcecode.VariableResolver.findAllVarMappingCombination(mappedVars, varNamesOne, 0, new java.util.TreeMap<>(), allCombinationsOne);
    return allCombinationsOne;
}