public static void main(java.lang.String[] args) throws java.io.IOException {
    java.io.FileOutputStream out;
    java.io.PrintStream p;
    try {
        out = new java.io.FileOutputStream("myfile.txt");
        p = new java.io.PrintStream(out);
        p.println("This is written to a file");
        p.close();
    } catch (java.lang.Exception e) {
        throw new java.io.IOException(e);
    }
}