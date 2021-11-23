public int getDestEntrance(int currDepth, int currPos, int posExit, int posExit2) {
    int num = currDepth % 5;
    int mul = currDepth / 5;
    switch (num) {
        case 0 :
            return this.entrance;
        case 1 :
            return this.entrance;
        case 2 :
            return this.entrance;
        case 3 :
            return this.entrance;
        case 4 :
            return this.entrance2;
        default :
            return this.entrance;
    }
}