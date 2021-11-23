public static final void Info(java.lang.String desc, java.util.List<Parser.Token> tokens) {
    java.lang.System.out.print((desc + ":["));
    for (Parser.Token token : tokens) {
        java.lang.System.out.print(((token.getValue()) + ","));
    }
    java.lang.System.out.println("]");
}