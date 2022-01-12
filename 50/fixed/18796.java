@java.lang.Override
public void exitForkStat(scallywags.langdradig.generate.ForkStatContext ctx) {
    if ((ctx.IDENTIFIER()) != null) {
        forkIDs.add(ctx.IDENTIFIER().getText());
    }
}