public void writeWeek(Days[] d) {
    java.io.File outFile = new java.io.File("progress.txt");
    java.io.FileWriter fWriter = new java.io.FileWriter(outFile);
    java.io.PrintWriter pWriter = new java.io.PrintWriter(fWriter);
    for (int i = 0; i < (d.length); i++) {
        pWriter.println(d[i].toString());
    }
    pWriter.close();
}