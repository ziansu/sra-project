public int checkIfWon(java.lang.String winningDenomination) {
    int payOutRatio;
    switch (winningDenomination) {
        case "JOKER" :
            payOutRatio = 40;
            break;
        case "CASINO" :
            payOutRatio = 40;
            break;
        case "1" :
            payOutRatio = 1;
            break;
        case "2" :
            payOutRatio = 2;
            break;
        case "5" :
            payOutRatio = 5;
            break;
        case "10" :
            payOutRatio = 10;
            break;
        case "20" :
            payOutRatio = 20;
            break;
        default :
            payOutRatio = -1;
    }
    return payOutRatio;
}