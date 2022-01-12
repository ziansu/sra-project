void addLocal(java.lang.String name, com.google.javascript.jscomp.newtypes.JSType declType, boolean isConstant, boolean isFromExterns) {
    com.google.common.base.Preconditions.checkArgument((!(name.contains("."))));
    if (isConstant) {
        constVars.add(name);
    }
    if (isFromExterns) {
        externs.put(name, declType);
    }else {
        locals.put(name, declType);
    }
}