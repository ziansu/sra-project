public static void main(java.lang.String[] args) {
    if (Tool.hasAccuracy(0.0, 0.0))
        java.lang.System.out.println("yattaze");
    
    Solver first = new Solver();
    first.read();
    Main.solve(first);
    java.lang.System.out.println("\n\n\n\n");
    Main.count = 0;
    Main.solve_(first);
}