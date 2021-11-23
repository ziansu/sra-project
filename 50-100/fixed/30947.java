private int calculateArmiesForStars(int stars) {
    switch (stars) {
        case 1 :
            return 1;
        case 2 :
            return 2;
        case 3 :
            return 4;
        case 4 :
            return 7;
        case 5 :
            return 10;
        case 6 :
            return 13;
        case 7 :
            return 17;
        case 8 :
            return 21;
        case 9 :
            return 25;
        default :
            return 30;
    }
}