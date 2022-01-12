@java.lang.Override
public int getNewMove(int input) {
    if ((movesDone.contains(input)) || ((movesDone.size()) == 9)) {
        return -1;
    }
    processMove(input, 'p');
    move = calculateMove();
    processMove(move, 'c');
    return move;
}