public boolean doubleDown() {
    if ((player.getMoney()) < ((dealer.getBettingPool()) / 2)) {
        java.lang.System.out.println("You don't have enough money to double down on that bet!");
        return false;
    }else {
        player.doubleDown(dealer);
        player.setMoney(((player.getMoney()) - ((dealer.getBettingPool()) / 2)));
        dealer.setBettingPool(((dealer.getBettingPool()) * 2));
        return true;
    }
}