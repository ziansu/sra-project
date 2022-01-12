protected void processOption(java.lang.String arg, java.util.ListIterator iter) {
    boolean hasOption = this.getOptions().hasOption(arg);
    if (!hasOption)
        return ;
    
    try {
        super.processOption(arg, iter);
    } catch (java.lang.Throwable e) {
        throw new java.lang.RuntimeException(e);
    }
}