public void updateLayoutValues(final de.tesis.dynaware.grapheditor.SkinLookup skinLookup, final de.tesis.dynaware.grapheditor.model.GNode node) {
    final org.eclipse.emf.common.command.CompoundCommand command = new org.eclipse.emf.common.command.CompoundCommand();
    de.tesis.dynaware.grapheditor.Commands.updateLayoutValues(command, model, skinLookup, node);
    editingDomain.getCommandStack().removeCommandStackListener(commandStackListener);
    try {
        if (command.canExecute()) {
            editingDomain.getCommandStack().execute(command);
        }
    } finally {
        editingDomain.getCommandStack().addCommandStackListener(commandStackListener);
    }
}