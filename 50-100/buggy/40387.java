public java.util.LinkedHashMap<java.lang.String, info.gameboxx.gameboxx.commands.api.Argument> getAllArguments() {
    if (isBase()) {
        return arguments;
    }
    java.util.LinkedHashMap<java.lang.String, info.gameboxx.gameboxx.commands.api.Argument> arguments = new java.util.LinkedHashMap(getBaseCmd().getArguments());
    arguments.putAll(this.arguments);
    return arguments;
}