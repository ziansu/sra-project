protected io.dropwizard.cli.Command getCommand(java.lang.String name) {
    if ((bootstrap) == null)
        throw new java.lang.RuntimeException("Must be initialized before getCommand is called.");
    
    for (io.dropwizard.cli.Command command : bootstrap.getCommands()) {
        if (command.getName().equals(name))
            return command;
        
    }
    return null;
}