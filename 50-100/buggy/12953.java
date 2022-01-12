public boolean createUser(boolean checkExists) {
    if ((!(userDefined())) || (checkExists && (userExists()))) {
        return false;
    }
    org.avaje.docker.commands.PostgresContainer.log.debug("create postgres user {}", config.containerName());
    java.lang.ProcessBuilder pb = createRole(dbConfig.getDbUser(), dbConfig.getDbPassword());
    java.util.List<java.lang.String> stdOutLines = org.avaje.docker.commands.process.ProcessHandler.process(pb).getStdOutLines();
    return (stdOutLines.size()) == 2;
}