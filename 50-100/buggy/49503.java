public int getStartIndex(char col) {
    int index = 0;
    switch (col) {
        case 'R' :
            index = 0;
            break;
        case 'B' :
            index = 7;
            break;
        case 'Y' :
            index = 14;
            break;
        case 'G' :
            index = 21;
            break;
        default :
            break;
    }
    return index;
}