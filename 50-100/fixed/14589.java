public boolean moveUp() {
    for (int i = 0; i < (board.length); i++) {
        for (int j = 1; j < (board.length); j++) {
            int temp = j;
            while (moveTo(j, i, (temp - 1), i)) {
                moveTo(j, i, (temp - 1), i);
                temp--;
            } 
        }
    }
    return false;
}