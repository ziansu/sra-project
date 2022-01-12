public static void main(java.lang.String[] args) {
    Solver first = new Solver();
    first.read();
    Main.reduce_piece_by_stack(first);
    java.lang.System.out.println("\n\n\n\n");
    Main.count = 0;
    Main.reduce_piece_by_rec(first);
}