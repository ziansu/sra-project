public static com.itrd.gai.interpreter.GAICommandType recognizeCommandType(java.lang.String command) {
    for (com.itrd.gai.interpreter.GAICommandType type : com.itrd.gai.interpreter.GAICommandType.values()) {
        if (command.matches(type.getRegexp())) {
            return type;
        }
    }
    return null;
}