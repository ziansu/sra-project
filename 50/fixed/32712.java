public int getNaturalRandom(int max, int no) {
    if (max <= 1) {
        return 0;
    }
    int random = no;
    while (random == no) {
        random = getNaturalRandom(max);
    } 
    return random;
}