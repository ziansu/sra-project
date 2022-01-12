@java.lang.Override
public void enterAbsolute(@org.antlr.v4.runtime.misc.NotNull
final se.tre.freki.query.SelectParser.AbsoluteContext ctx) {
    super.enterAbsolute(ctx);
    buildTime(java.lang.Long.parseLong(ctx.getText()));
}