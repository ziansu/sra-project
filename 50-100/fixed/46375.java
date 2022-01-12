public java.lang.String boardToText() {
    java.lang.String output = "  0 1 2 3 4 5 6 7\n";
    for (int rowi = 0; rowi < 8; rowi++) {
        output += rowi;
        for (int coli = 0; coli < 8; coli++) {
            if ((board[rowi][coli]) != null) {
                output += " " + (board[rowi][coli].id);
            }else {
                output += " -";
            }
        }
        output += "\n";
    }
    java.lang.System.out.println(output);
    return output;
}