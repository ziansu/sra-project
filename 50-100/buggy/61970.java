private int nextSafePoint() {
    switch (currentSafePoint) {
        case 0 :
            return 5;
        case 1 :
            return 6;
        case 2 :
            return 7;
        case 3 :
            return 0;
        case 4 :
            return 0;
        case 5 :
            return 1;
        case 6 :
            return 2;
        case 7 :
            return 4;
        default :
            return 0;
    }
}