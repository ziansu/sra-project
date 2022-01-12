@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (e.getActionCommand().equals("errors")) {
        chatty.gui.GuiUtil.showNonModalMessage(getInvoker(), "Errors", errorsInfo, javax.swing.JOptionPane.WARNING_MESSAGE);
    }
    if (e instanceof chatty.gui.components.menus.CommandActionEvent) {
        chatty.util.commands.CustomCommand command = ((chatty.gui.components.menus.CommandActionEvent) (e)).getCommand();
        chatty.gui.components.settings.CommandSettings.showCommandInfoPopup(getInvoker(), command);
    }
}