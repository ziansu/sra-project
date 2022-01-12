public void coinAdded(org.lsmr.vendingmachine.control.CoinReceptacleSimulator receptacle, org.lsmr.vendingmachine.control.Coin coin) {
    if (hardware.getController().getOutOfOrder()) {
        try {
            hardware.getCoinReceptacle().returnCoins();
        } catch (java.lang.Exception e) {
            hardware.enableSafety();
        }
    }else {
        hardware.getController().incrementCredit(coin.getValue());
        hardware.getDisplay().display(hardware.getController().getCreditString());
    }
}