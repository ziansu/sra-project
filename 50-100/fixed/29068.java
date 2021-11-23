static int maxFact(int max) {
    int maxFact = -1;
    for (int i = 0; i < max; ++i) {
        if ((Worker.fact(i)) <= max) {
            maxFact = i;
        }else {
            break;
        }
    }
    return maxFact;
}