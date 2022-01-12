public static boolean canGetValue(java.lang.String line) {
    return (((com.blazingkin.interpreter.variables.Variable.isInteger(line)) || (com.blazingkin.interpreter.variables.Variable.isDouble(line))) || (com.blazingkin.interpreter.variables.Variable.isBool(line))) || (com.blazingkin.interpreter.variables.Variable.isString(line));
}