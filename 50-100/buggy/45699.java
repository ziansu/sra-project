public void handleRun() {
    modelController.assemble(view.getUserText());
    this.iterator = modelController.getCommandIterator();
    while (iterator.hasNext()) {
        model.commands.Command command = iterator.next();
        mementoManager.saveState();
        command.apply();
        view.updateRegisters(modelController.getRegisterValues());
        java.lang.System.out.println("did a command");
    } 
}