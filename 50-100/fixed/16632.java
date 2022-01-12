public void addLine(java.lang.String line) {
    if (!(fileSizeSet)) {
        java.lang.System.err.println("the mapsize is not set");
    }
    if ((line.length()) != (width)) {
        java.lang.System.err.println("the length of the line is not correct");
    }
    writer.println(line);
    (lineCounter)++;
}