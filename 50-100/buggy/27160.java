public java.lang.String scoring() {
    if (((dealerTotal) > (userTotal)) && ((dealerTotal) <= 21)) {
        return "Dealer Wins!";
    }else
        if ((dealerTotal) == (userTotal)) {
            return "Tie!";
        }else {
            return "You Win!";
        }
    
}