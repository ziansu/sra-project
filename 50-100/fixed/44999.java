private boolean suppressDupPropWarning(com.google.javascript.rhino.JSDocInfo propCreationJsdoc, com.google.javascript.jscomp.newtypes.JSType typeInJsdoc, com.google.javascript.jscomp.newtypes.JSType previousType) {
    if ((propCreationJsdoc == null) || (!(propCreationJsdoc.getSuppressions().contains("duplicate")))) {
        return false;
    }
    return (typeInJsdoc == null) || (typeInJsdoc.equals(previousType));
}