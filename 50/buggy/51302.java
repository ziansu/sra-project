public boolean solve() {
    if ((startx) < 0) {
        java.lang.System.out.println("No starting point 'S' found in maze.");
        return false;
    }else {
        maze[startx][starty] = ' ';
        return solve(startx, starty);
    }
}