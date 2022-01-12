public int getAttackACModifier() {
    switch (size) {
        case 1 :
            return 16;
        case 2 :
            return 12;
        case 3 :
            return 10;
        case 4 :
            return 9;
        case 5 :
            return 8;
        case 6 :
            return 7;
        case 7 :
            return 6;
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