public static void executeEventCommands(com.github.nthportal.uhc.core.Context context, java.lang.String event, java.util.List<java.util.function.Function<java.lang.String, java.lang.String>> replaceFunctions) {
    lombok.val commands = context.plugin().getConfig().getStringList(event);
    for (java.lang.String command : commands) {
        if (command.startsWith("/")) {
            command = command.substring(1);
        }
        for (lombok.val function : replaceFunctions) {
            command = function.apply(command);
        }
        com.github.nthportal.uhc.util.CommandUtil.executeCommand(context, command);
    }
}