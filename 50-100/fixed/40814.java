@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent ae) {
    bjg.hand.Bet();
    lblTotalBet.setText(("Bet: " + (bjg.hand.getBet())));
    lblChipCount.setText(("Chips: " + (bjg.hand.getChipCount())));
    lblDealer.setText("Increase your bet or deal the cards.");
    if ((bjg.hand.getBet()) > 0) {
        btnDeal.setEnabled(true);
    }
}