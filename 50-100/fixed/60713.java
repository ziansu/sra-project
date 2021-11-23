public int[] getScores(int category) {
    if ((category < 1) || (category > 5))
        return null;
    
    int offset = category - 1;
    int[] tempScores = new int[5];
    for (int i = 0; i < 5; i++) {
        tempScores[i] = scores[((offset * 5) + i)].getScore();
    }
    return tempScores;
}