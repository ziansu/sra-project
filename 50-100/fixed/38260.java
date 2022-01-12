private void processStandaloneOption(java.util.Collection<java.lang.reflect.Field> required, java.lang.String arg, java.util.Stack<java.lang.String> args, boolean paramAttachedToKey) throws java.lang.Exception {
    java.lang.reflect.Field field = optionName2Field.get(arg);
    required.remove(field);
    picocli.CommandLine.Arity arity = picocli.CommandLine.Arity.forOption(field);
    if (paramAttachedToKey) {
        arity.min = java.lang.Math.max(1, arity.min);
    }
    applyOption(field, picocli.CommandLine.Option.class, arity, paramAttachedToKey, args);
}