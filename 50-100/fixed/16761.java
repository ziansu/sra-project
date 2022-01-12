public boolean PayPlayer(int PlayerIndex, int amount) {
    if ((ValidPlayerIndex(PlayerIndex)) == false)
        return false;
    else {
        int NewAmount = (GameBoard.GetBalance()) - amount;
        if (NewAmount >= 0) {
            GameBoard.SetBalance(NewAmount);
            ListPlayer.get((PlayerIndex - 1)).AddToMoney(amount);
            return true;
        }else
            return false;
        
    }
}