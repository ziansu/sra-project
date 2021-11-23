@java.lang.Override
public void exitForkStat(scallywags.langdradig.generate.ForkStatContext ctx) {
    java.lang.System.out.println(ctx);
    java.lang.System.out.println(ctx.IDENTIFIER());
    forkIDs.add(ctx.IDENTIFIER().getText());
}