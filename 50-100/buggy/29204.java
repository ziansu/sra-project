public boolean setPeice(com.rahul.othello.Coin coin, com.rahul.othello.Point point) {
    if ((this.getPeice(point)) == (Coin.empty)) {
        boardArray[point.getX()][point.getY()] = coin;
        if (flipCoins(coin, point, true)) {
            changeTurn();
            return true;
        }else
            return false;
        
    }else
        return false;
    
}