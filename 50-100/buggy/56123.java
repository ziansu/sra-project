@java.lang.Override
public void digest(java.util.Set<gomoku.Action> actions) {
    int i = 0;
    int j = 0;
    for (gomoku.Action a : actions) {
        i = a.y();
        j = a.x();
        ref[i][j].setIcon(empty);
        ref[i][j].paintImmediately((i * (gomoku.Main.L)), (j * (gomoku.Main.L)), gomoku.Main.L, gomoku.Main.L);
    }
}