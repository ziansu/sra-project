void print(Node t, int n, boolean p) {
    if (!p) {
        for (int i = 0; i < n; i++) {
            java.lang.System.out.print(" ");
        }
        java.lang.System.out.print("(");
    }
    t.getCar().print(n, false);
    if (!(t.getCdr().isNull()))
        java.lang.System.out.print(" ");
    
    t.getCdr().print(n, true);
}