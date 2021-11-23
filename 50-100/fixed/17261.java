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
    return name;
}