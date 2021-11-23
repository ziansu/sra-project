public void scoring() {
    if (((dealerTotal) > (userTotal)) && ((dealerTotal) <= 21)) {
        message = "Dealer Wins!";
    }else
        if ((dealerTotal) == (userTotal)) {
            message = "Tie!";
        }else {
            message = "You Win!";
        }
    
}