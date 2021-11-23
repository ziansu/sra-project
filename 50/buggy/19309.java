@java.lang.Override
protected void finalize() throws java.lang.Throwable {
    if ((this.closedAt) != null) {
        this.close();
        java.lang.System.err.println("Hunspell instance was not closed!");
    }
    super.finalize();
}