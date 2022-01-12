public com.tr.rp.ast.Function getFunction(java.lang.String name) throws com.tr.rp.exceptions.RPLFunctionUndefinedException {
    if (!(definedFunctions.containsKey(name))) {
        throw new com.tr.rp.exceptions.RPLFunctionUndefinedException(name);
    }
    return definedFunctions.get(name);
}