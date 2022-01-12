public int getHideModifier() {
    switch (size) {
        case 1 :
            return 32;
        case 2 :
            return 28;
        case 3 :
            return 24;
        case 4 :
            return 20;
        case 5 :
            return 16;
        case 6 :
            return 12;
        case 7 :
            return 8;
        case 8 :
            return 4;
        case 9 :
            return 0;
        case 10 :
            return 0;
        default :
            return 0;
    }
}