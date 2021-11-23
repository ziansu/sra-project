public int GetScore(int s) {
    if (isError)
        return -1;
    
    return scores.get(s);
}