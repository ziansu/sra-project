public int[] pop() {
    if ((front) <= (back)) {
        return queue[((front)++)];
    }else {
        return new int[]{ -1 , -1 , -1 , -1 };
    }
}