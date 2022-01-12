public void printErr(java.lang.String text) {
    if ((pout) == null) {
        java.lang.System.err.println(("Output file undefined: " + (this.outFile.getName())));
        return ;
    }
    pout.println(text);
    pout.flush();
}