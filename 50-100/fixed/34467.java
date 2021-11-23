public java.lang.String toString() {
    java.lang.String ans = "";
    for (int r = 0; r < (maze.length); r++) {
        for (int c = 0; c < (maze[r].length); c++) {
            ans += maze[r][c];
        }
        ans += '\n';
    }
    return ans;
}