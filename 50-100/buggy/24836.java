public final void executeSequence(java.util.List<java.util.List<java.lang.String>> args) throws com.github.agadar.javacommander.JavaCommanderException {
    if (args == null) {
        this.execute("");
    }else {
        for (java.util.List<java.lang.String> tokens : args) {
            this.execute(tokens);
        }
    }
}