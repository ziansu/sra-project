public boolean setPeice(com.rahul.othello.Coin coin, com.rahul.othello.Point point) {
    if ((this.getPeice(point)) == (Coin.empty)) {
        if (flipCoins(coin, point, true)) {
            boardArray[point.getX()][point.getY()] = coin;
            changeTurn();
            return true;
        }else
            return false;
        
    }else
        return false;
    
}