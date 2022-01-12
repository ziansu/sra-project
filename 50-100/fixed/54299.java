public void updateLayoutValues(final de.tesis.dynaware.grapheditor.SkinLookup skinLookup) {
    final org.eclipse.emf.common.command.CompoundCommand command = new org.eclipse.emf.common.command.CompoundCommand();
    de.tesis.dynaware.grapheditor.Commands.updateLayoutValues(command, model, skinLookup);
    editingDomain.getCommandStack().removeCommandStackListener(commandStackListener);
    if (command.canExecute()) {
        editingDomain.getCommandStack().execute(command);
    }
    editingDomain.getCommandStack().addCommandStackListener(commandStackListener);
}