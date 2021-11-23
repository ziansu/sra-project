public mobi.designmyapp.common.container.model.Container.CommandContainerBuilder executeCommand(mobi.designmyapp.common.container.model.Container.Command command) {
    if (command != null) {
        throw new java.lang.IllegalStateException("Can only execute one command.");
    }
    options.command = command;
    return this;
}