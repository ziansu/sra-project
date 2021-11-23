private java.lang.String getVarName(final org.sosy_lab.cpachecker.util.states.MemoryLocation pMl) {
    java.lang.String prefix = (pMl.isOnFunctionStack()) ? pMl.getFunctionName() : "";
    return (prefix + "::") + (pMl.getIdentifier());
}