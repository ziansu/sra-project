public static int getRoadSpeed(int speed) {
    int spd = 0;
    switch (speed) {
        case 0 :
            spd = 5;
            break;
        case 1 :
            spd = 20;
            break;
        case 2 :
            spd = 40;
            break;
        case 3 :
            spd = 60;
            break;
        case 4 :
            spd = 80;
            break;
        case 5 :
            spd = 100;
            break;
        case 6 :
            spd = 110;
            break;
        case 7 :
            spd = 150;
            break;
    }
    return spd;
}