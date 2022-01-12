public static void main(java.lang.String[] args) throws java.io.FileNotFoundException {
    if ((args.length) != 1)
        java.lang.System.out.println("Usage: java SudokuText filename");
    else {
        java.lang.String filename = args[0];
        java.io.File file = new java.io.File(filename);
        java.util.Scanner f = new java.util.Scanner(file);
        SudokuModel m = new SudokuModel(f);
        java.lang.System.out.println("initial board");
        java.lang.System.out.println(m);
        if (m.solve())
            java.lang.System.out.println("Solution:");
        else
            java.lang.System.out.println("No solution");
        
        java.lang.System.out.println(m);
    }
}