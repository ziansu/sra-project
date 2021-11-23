@java.lang.Override
public void execute(java.lang.String[] args) throws org.neo4j.commandline.admin.CommandFailed, org.neo4j.commandline.admin.IncorrectUsage {
    org.neo4j.helpers.Args parsedArgs = validateArgs(args);
    try {
        setPassword(parsedArgs.orphans().get(0));
    } catch (org.neo4j.commandline.admin.IncorrectUsage e) {
        throw e;
    } catch (java.lang.Throwable throwable) {
        throw new org.neo4j.commandline.admin.CommandFailed(("Failed to execute 'set-initial-password' command: " + (throwable.getMessage())), new java.lang.RuntimeException(throwable));
    }
}