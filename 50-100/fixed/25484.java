@java.lang.Override
public java.lang.String toString() {
    dameo.move.Move firstMove = moves.get(0);
    dameo.move.Move lastMove = moves.get(((moves.size()) - 1));
    return java.lang.String.format("Multi-piece <%d,%d>:<%d,%d>", ((lastMove.oldX) + 1), ((lastMove.oldY) + 1), ((firstMove.newX) + 1), ((firstMove.newY) + 1));
}