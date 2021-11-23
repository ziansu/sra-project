void addLocal(java.lang.String name, com.google.javascript.jscomp.newtypes.JSType declType, boolean isConstant, boolean isFromExterns) {
    com.google.common.base.Preconditions.checkArgument((!(name.contains("."))));
    com.google.common.base.Preconditions.checkArgument((!(isDefinedLocally(name, false))));
    if (isConstant) {
        constVars.add(name);
    }
    if (isFromExterns) {
        externs.put(name, declType);
    }else {
        locals.put(name, declType);
    }
}