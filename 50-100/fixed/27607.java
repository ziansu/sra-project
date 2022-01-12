private static void processRule1(java.lang.String file1, java.lang.String file2) throws innovimax.mixthem.MixException {
    java.io.File file = new java.io.File(file1);
    java.io.FileReader in = new java.io.FileReader(file);
    java.io.FileWriter out = new java.io.FileWriter(((file.getName()) + "mix"));
    int c;
    while ((c = in.read()) != (-1)) {
        out.write(c);
        in.close();
        out.close();
    } 
}