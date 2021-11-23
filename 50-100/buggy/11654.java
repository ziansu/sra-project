private boolean isManaTurn(int turnNum) {
    int current = 1;
    int past = 0;
    while (current < (turnNum + 1)) {
        int temp = current;
        current += past;
        past = temp;
        if (current == turnNum) {
            return true;
        }
    } 
    return false;
}