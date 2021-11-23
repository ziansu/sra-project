public int containsStraight() {
    startLoop : for (int i = 0; i <= 9; i++) {
        for (int j = i; j < (i + 5); j++) {
            if ((numberOf((j % 13))) != 1)
                continue startLoop;
            
        }
        return i;
    }
    return -1;
}