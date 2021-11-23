private void pushState() {
    states.push(new org.jglr.ns.CompilerState(varName2Id, varName2Type, varId, labelBase, labelID, currentMethodDef));
    varName2Id.clear();
    varName2Type.clear();
    varId = 1;
    labelBase = "L";
    labelID = 0;
}