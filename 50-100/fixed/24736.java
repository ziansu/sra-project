public java.lang.String toString() {
    java.lang.String print = (N) + "\n";
    for (int i = 0; i < (N); i++) {
        for (int j = 0; j < (N); j++) {
            print += (" " + (board[i][j])) + " ";
        }
        print += "\n";
    }
    return print;
}