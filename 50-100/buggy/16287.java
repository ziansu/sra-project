private java.util.List<java.lang.String> Sig() {
    java.util.List<java.lang.String> parsed = new java.util.ArrayList<>();
    eat(wolf.parser.TLParen.class, parsed);
    if ((token) instanceof wolf.parser.TIdentifier) {
        parsed.addAll(SigArgs());
    }
    eat(wolf.parser.TRParen.class, parsed);
    log("Sig", parsed);
}