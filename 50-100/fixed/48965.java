private int max(int[] currentPos) {
    int index = 0;
    int max = currentPos[index];
    for (int i = 1; i < (currentPos.length); i++)
        if ((currentPos[i]) > max) {
            index = i;
            max = currentPos[i];
        }
    
    return index;
}