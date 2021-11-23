void print(Node t, int n, boolean p) {
    if (!p) {
        java.lang.System.out.print("(");
    }
    t.getCar().print(n, false);
    if (!(t.getCdr().isNull()))
        java.lang.System.out.print(" ");
    
    t.getCdr().print(n, true);
}