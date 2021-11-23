public static void unregisterShellModule(java.lang.Class shellModule) {
    final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(net.es.netshell.shell.ShellCommandsFactory.class);
    java.lang.reflect.Method[] methods = shellModule.getMethods();
    for (java.lang.reflect.Method method : methods) {
        net.es.netshell.shell.annotations.ShellCommand command = method.getAnnotation(net.es.netshell.shell.annotations.ShellCommand.class);
        if (command != null) {
            logger.info("Removing Shell command {}", command.name());
            net.es.netshell.shell.ShellCommandsFactory.shellCommands.remove(command.name());
        }
    }
}