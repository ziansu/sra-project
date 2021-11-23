void writeArrayToFile(byte[][] state, java.io.PrintWriter p) throws java.io.IOException {
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            p.print(java.lang.String.format("%02x", state[i][j]));
        }
    }
    p.println("\n");
}