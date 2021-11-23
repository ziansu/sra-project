private static void plainRead() {
    java.lang.String line;
    do
        line = fileio.FileParser.readLine();
    while (!(line.trim().equals(fileio.SECTION_SEPARATOR)) );
}