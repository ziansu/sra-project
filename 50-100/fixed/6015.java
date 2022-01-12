public javax.swing.JMenuItem getJMenuItem(java.lang.String commandName) {
    final jloda.gui.commands.ICommand command = getCommand(commandName);
    if (command != null) {
        final javax.swing.JMenuItem item = getJMenuItem(command);
        if (item != null) {
            item.setEnabled(command.isApplicable());
            return item;
        }
    }
    return null;
}