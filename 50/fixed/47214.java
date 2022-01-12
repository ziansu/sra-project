@java.lang.Override
public void enterGroupElseBlock(org.wso2.carbon.ibus.mediation.cheetah.config.dsl.external.wuml.generated.WUMLParser.GroupElseBlockContext ctx) {
    transactionMultiThenBlockStarted = false;
    transactionElseBlockStarted = true;
    super.enterGroupElseBlock(ctx);
}