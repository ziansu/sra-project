@java.lang.Override
public int[] move() {
    for (int[] move : preferredMoves) {
        if ((cells[move[0]][move[1]].getContent()) == (edu.nyu.xiaoqianyu.tictactoe.dataType.Seed.EMPTY)) {
            return move;
        }
    }
    return null;
}