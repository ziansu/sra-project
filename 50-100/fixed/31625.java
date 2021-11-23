public static void main(java.lang.String[] args) {
    java.lang.String filename = "complete-input-3";
    if (Solver.localTesting) {
        try {
            java.lang.System.setIn(new java.io.FileInputStream(filename));
        } catch (java.io.FileNotFoundException e) {
        }
    }
    Solver s = null;
    if ((args.length) != 0) {
        s = new Solver(java.lang.Integer.parseInt(args[0]));
    }else {
        s = new Solver();
    }
    s.solve();
}