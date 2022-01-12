public static boolean canGetValue(java.lang.String line) {
    if (com.blazingkin.interpreter.variables.Variable.isInteger(line)) {
        return true;
    }
    if (com.blazingkin.interpreter.variables.Variable.isDouble(line)) {
        return true;
    }
    if (com.blazingkin.interpreter.variables.Variable.isBool(line)) {
        return true;
    }
    if (com.blazingkin.interpreter.variables.Variable.isString(line)) {
        return true;
    }
    return false;
}