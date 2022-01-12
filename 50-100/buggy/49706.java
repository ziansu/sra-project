public boolean save(java.io.PrintStream out) {
    out.println("connected:count");
    for (int i = 0; i < (connectedIndex.length); i++) {
        out.println((((connectedIndex[i]) + ":") + (connectedCount[i])));
    }
    return true;
}