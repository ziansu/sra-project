@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String name = e.getActionCommand();
    globalAuction.getCurrentPlayer().setName(name);
    java.lang.System.out.println(((name + " by ") + (globalAuction.getCurrentPlayer().getPlayerName())));
    txtPula.setText(((globalAuction.getCurrentPot()) + ""));
    txtStawka.setText(((globalAuction.getCurrentBet()) + ""));
}