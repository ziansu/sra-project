public void playAction() {
    edu.ncsu.monopoly.Player currentPlayer = edu.ncsu.monopoly.GameMaster.instance().getCurrentPlayer();
    int rentToCharge = 32;
    currentPlayer.payRentToBank(rentToCharge);
    return ;
}