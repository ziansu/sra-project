public static java.lang.String getLocalVariableName(int var, int lineNumber) {
    java.lang.String name = null;
    for (hu.advancedweb.scott.runtime.track.LocalVariableName localVariableName : hu.advancedweb.scott.runtime.track.LocalVariableStateRegistry.LOCAL_VARIABLE_NAMES) {
        if (var == (localVariableName.var)) {
            if ((localVariableName.lineNumber) > lineNumber) {
                break;
            }else {
                name = localVariableName.name;
            }
        }
    }
    if (name == null) {
        throw new java.lang.IllegalStateException("Name is null!");
    }
    return name;
}