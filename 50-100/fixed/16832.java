@java.lang.Override
public Concrete.SigmaExpression visitSigma(com.jetbrains.jetpad.vclang.parser.SigmaContext ctx) {
    java.util.List<com.jetbrains.jetpad.vclang.term.Concrete.TypeArgument> args = visitTeles(ctx.tele());
    for (com.jetbrains.jetpad.vclang.term.Concrete.TypeArgument arg : args) {
        if (!(arg.getExplicit())) {
            myErrorReporter.report(new com.jetbrains.jetpad.vclang.parser.ParserError(arg.getPosition(), "Fields in sigma types must be explicit"));
        }
    }
    return new com.jetbrains.jetpad.vclang.term.Concrete.SigmaExpression(tokenPosition(ctx.getStart()), args);
}