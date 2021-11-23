public static void main(java.lang.String[] args) {
    java.util.Scanner in = new java.util.Scanner(java.lang.System.in);
    java.lang.String fname = new java.lang.String((("InputData" + (java.io.File.separator)) + (args[0])));
    p2MainClasses.DataFilePopulator datafp = new p2MainClasses.DataFilePopulator(fname, in);
    datafp.populate();
}