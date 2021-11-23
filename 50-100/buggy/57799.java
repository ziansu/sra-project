public int getHomeIndex(char col) {
    int index = 0;
    switch (col) {
        case 'R' :
            index = 27;
            break;
        case 'B' :
            index = 6;
            break;
        case 'Y' :
            index = 13;
            break;
        case 'G' :
            index = 20;
            break;
        default :
            break;
    }
    return index;
}