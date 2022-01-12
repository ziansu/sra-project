public static void initNodeStatics(int max_row, int max_col) {
    searchclient.Node.MAX_ROW = max_row;
    searchclient.Node.MAX_COL = max_col;
    searchclient.Node.walls = new boolean[searchclient.Node.MAX_ROW][searchclient.Node.MAX_COL];
    searchclient.Node.goals = new char[searchclient.Node.MAX_ROW][searchclient.Node.MAX_COL];
}