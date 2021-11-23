public void writeHeuristicVal(double[] d) {
    java.io.File outFile = new java.io.File("heuristic.txt");
    java.io.FileWriter fWriter = new java.io.FileWriter(outFile);
    java.io.PrintWriter pWriter = new java.io.PrintWriter(fWriter);
    for (int i = 0; i < (d.size); i++) {
        pWriter.println(d[i].toString());
    }
    pWriter.close();
}