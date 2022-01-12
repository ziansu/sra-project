@java.lang.Override
public void enterGroupStatement(org.wso2.carbon.ibus.mediation.cheetah.config.dsl.external.wuml.generated.WUMLParser.GroupStatementContext ctx) {
    org.wso2.carbon.ibus.mediation.cheetah.config.dsl.external.wuml.WUMLBaseListenerImpl.log.info("enterGroupStatement:");
    org.wso2.carbon.ibus.mediation.cheetah.flow.mediators.BeginTransactionMediator beginTransactionMediator = new org.wso2.carbon.ibus.mediation.cheetah.flow.mediators.BeginTransactionMediator();
    integrationFlow.getEsbConfigHolder().getPipeline(pipelineStack.peek()).addMediator(beginTransactionMediator);
    transactionMediatorStack.push(beginTransactionMediator);
    super.enterGroupStatement(ctx);
}