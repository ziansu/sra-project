public static int getBet(boolean winner, int betCheck, int bet) {
    if (winner) {
        switch (betCheck) {
            case 0 :
                break;
            case 1 :
                bet *= 2;
                break;
            case 2 :
                bet /= -2;
                break;
        }
    }else {
        switch (betCheck) {
            case 0 :
                bet = -bet;
                break;
            case 1 :
                bet *= -2;
                break;
            case 2 :
                bet /= -2;
                break;
        }
    }
    return bet;
}