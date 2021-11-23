@java.lang.Override
public void exitForkStat(scallywags.langdradig.generate.ForkStatContext ctx) {
    forkIDs.add(ctx.IDENTIFIER().getText());
}