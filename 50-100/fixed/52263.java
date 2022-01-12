public static void main(java.lang.String[] args) throws java.io.IOException {
    for (int i = 0; i < (args.length); i++) {
        Page p = new Page(Page.fileToArray(args[i]));
        Solver s = new Solver(p);
        s.solve();
        s.printToFile(((args[i]) + ".out"));
        java.lang.System.out.println();
    }
}