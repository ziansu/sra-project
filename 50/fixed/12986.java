public static void main(java.lang.String[] args) {
    Z80 gb = new Z80();
    gb.reset();
    gb.loadCartridge(args[0]);
    gb.playCartridge();
}