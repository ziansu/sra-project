@java.lang.Override
protected Transaction.Status doTransaction(com.dianping.platform.slb.agent.transaction.Transaction transaction) {
    int exitCode = com.dianping.platform.slb.agent.task.workflow.step.Step.CODE_FAIL;
    try {
        exitCode = m_engine.executeStep(ConfigUpgradeStep.INIT, transaction);
    } catch (java.lang.Exception ex) {
        exitCode = com.dianping.platform.slb.agent.task.workflow.step.Step.CODE_FAIL;
        com.dianping.platform.slb.agent.task.processor.config.UpgradeTransactionProcessor.m_logger.error(("[do transaction error]" + (transaction.getTransactionID())), ex);
    }
    if (exitCode == (com.dianping.platform.slb.agent.task.workflow.step.Step.CODE_SUCCESS)) {
        return Transaction.Status.SUCCESS;
    }else {
        return Transaction.Status.FAILED;
    }
}