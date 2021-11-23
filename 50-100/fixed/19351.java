@java.lang.Override
public void actionPerformed(final java.awt.event.ActionEvent e) {
    final ch.fork.AdHocRailway.model.turnouts.TurnoutGroup selectedTurnoutGroup = turnoutGroupModel.getSelection();
    if (selectedTurnoutGroup == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please select a locomotive group", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return ;
    }
    final ch.fork.AdHocRailway.model.turnouts.Turnout newTurnout = ch.fork.AdHocRailway.ui.turnouts.configuration.TurnoutHelper.createDefaultTurnout(turnoutManager);
    new ch.fork.AdHocRailway.ui.turnouts.configuration.TurnoutConfig(this, ctx, newTurnout, selectedTurnoutGroup, true);
}