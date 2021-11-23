public void update(java.util.Observable subject, java.lang.Object info) {
    coinmachine.CoinMachine coinMachine = ((coinmachine.CoinMachine) (subject));
    if ((coinMachine.getCount()) == (coinMachine.getCapacity())) {
        messageLabel.setText("This machine is full");
        messageLabel.setForeground(java.awt.Color.RED);
    }
    int numCoins = coinMachine.getCount();
    coinsNumTextField.setText(java.lang.String.valueOf(numCoins));
}