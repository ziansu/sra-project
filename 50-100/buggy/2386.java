void writeArrayToFile(byte[][] state, java.lang.String filename) throws java.io.IOException {
    java.io.PrintWriter p = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter(filename)));
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            p.print(java.lang.String.format("%02x", state[i][j]));
        }
    }
    p.println(" ");
    p.close();
}