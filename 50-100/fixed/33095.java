public static void main(java.lang.String[] args) {
    java.lang.String filename = "";
    boolean debug = false;
    try {
        filename = args[0];
        if ((args.length) > 1) {
            if (args[1].equals("-d")) {
                debug = true;
            }
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Usage: java Parser <filename> [-d]");
    }
    Parser parser = new Parser(filename, debug);
    if (debug) {
        parser.printVCG();
    }
}