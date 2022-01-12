private java.lang.String[] resolveAlias(java.lang.String[] commandLine) {
    java.lang.String[] result = commandLine.clone();
    if (((result.length) >= 1) && ((commandExecutor.getRepositoryLocation()) != null)) {
        com.codeaffine.gonsole.internal.interpreter.AliasConfig aliasConfig = new com.codeaffine.gonsole.internal.interpreter.AliasConfig(commandExecutor.getRepositoryLocation());
        java.lang.String command = aliasConfig.getCommand(commandLine[0]);
        if (command != null) {
            result[0] = command;
        }
    }
    return result;
}