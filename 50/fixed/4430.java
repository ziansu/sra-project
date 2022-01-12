public void visit(Print e) {
    java.lang.System.out.println(e.getRhs());
    e.getRhs().accept(this);
    java.lang.System.out.println(("\nPrinting : " + (val)));
    val = 0;
}