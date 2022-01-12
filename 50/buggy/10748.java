@java.lang.Override
public void addElement(int x, int y, java.lang.String s) {
    if (grid[y][x].equals(null)) {
        grid[y][x] = s;
        turn = !(turn);
    }
}