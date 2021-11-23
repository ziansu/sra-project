public javax.swing.JMenuItem getJMenuItem(java.lang.String commandName) {
    jloda.gui.commands.ICommand command = getCommand(commandName);
    javax.swing.JMenuItem item = getJMenuItem(command);
    if ((item != null) && (command != null))
        item.setEnabled(command.isApplicable());
    
    return item;
}