private java.util.function.Consumer<java.lang.String> unthrownFailure() {
    return ( s_statement) -> {
        super.noThrow();
        super.setLevel(LogLevel.ERROR);
        if ("".equals(statement)) {
            super.setMessage("Failure to compile sql statement");
        }else {
            super.setMessage(new java.lang.StringBuilder("Failure to execute sql statement: ").append(s_statement).append(". ").toString());
        }
    };
}