private int setMode(int flag, int nextMode) {
    flag &= 252;
    switch (nextMode) {
        case 0 :
            return flag;
        case 1 :
            return flag | 1;
        case 2 :
            return flag | 2;
        case 3 :
            return flag | 3;
        default :
            return flag;
    }
}