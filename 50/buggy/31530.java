@java.lang.Override
public void enterGroupMultiThenBlock(org.wso2.carbon.ibus.mediation.cheetah.config.dsl.external.wuml.generated.WUMLParser.GroupMultiThenBlockContext ctx) {
    org.wso2.carbon.ibus.mediation.cheetah.config.dsl.external.wuml.WUMLBaseListenerImpl.log.info("enterGroupMultiThenBlock:");
    transactionMultiThenBlockStarted = true;
    super.enterGroupMultiThenBlock(ctx);
}