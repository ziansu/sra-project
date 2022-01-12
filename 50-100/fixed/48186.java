public java.lang.String visitAtom_trailer(lessa.ExprParser.Atom_trailerContext ctx) {
    java.lang.System.out.println("atom_trailer -> (THIS '.')? atom  (trailer)*");
    java.lang.String at = "";
    if ((ctx.THIS()) != null) {
        at = "this.";
    }
    at += visit(ctx.atom());
    int i = 0;
    while ((ctx.trailer(i)) != null) {
        at += visit(ctx.trailer((i++)));
        i++;
    } 
    return at;
}