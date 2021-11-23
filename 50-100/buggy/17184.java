private java.lang.String argumentBuilder(java.lang.String[] args) {
    if ((args != null) && ((args.length) > 0)) {
        java.lang.StringBuilder argsList = new java.lang.StringBuilder();
        for (int i = 0; i < (args.length); ++i) {
            argsList.append(args[0]);
            if (i < ((args.length) - 1)) {
                argsList.append(" ");
            }
        }
        return argsList.toString();
    }
    return "";
}