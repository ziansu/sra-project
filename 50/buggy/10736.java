public void visitFrom(int side) {
    java.lang.System.out.print((("From this cell: break " + side) + "\n"));
    walls[side] = 0;
    update();
}