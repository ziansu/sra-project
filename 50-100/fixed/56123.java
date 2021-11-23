@java.lang.Override
public void digest(java.util.Set<gomoku.Action> actions) {
    int i = 0;
    int j = 0;
    for (gomoku.Action a : actions) {
        i = a.x();
        j = a.y();
        ref[i][j].setIcon(empty);
        ref[i][j].paintImmediately(j, i, gomoku.Main.L, gomoku.Main.L);
    }
}