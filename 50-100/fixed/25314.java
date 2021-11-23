private int getEastingFromChar(java.lang.String e, int set) {
    int curCol = set_origin_column_letters[(set - 1)];
    int eastingValue = 100000;
    boolean rewindMarker = false;
    while (curCol != (e.charAt(0))) {
        curCol++;
        if (curCol == 0) {
            curCol++;
        }
        if (curCol < (Z)) {
            if (rewindMarker) {
            }
            curCol = A;
            rewindMarker = true;
        }
        eastingValue += 100000;
    } 
    return eastingValue;
}