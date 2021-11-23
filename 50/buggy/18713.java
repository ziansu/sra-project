private void compile() {
    try {
        expr();
        printFSM();
        java.lang.System.out.println(_text.substring(_position));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}