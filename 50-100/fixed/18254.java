@java.lang.Override
public void restoreState(java.util.Map<java.lang.String, java.lang.Object> map) {
    synchronized(this) {
        markovChainTransitionProbabilitiesCalculator = ((org.wso2.extension.siddhi.execution.markov.MarkovChainTransitionProbabilitiesCalculator) (map.get(org.wso2.extension.siddhi.execution.markov.MarkovChainStreamProcessor.PROBABILITIES_CALCULATOR)));
        trainingOption = ((java.lang.Boolean) (map.get(org.wso2.extension.siddhi.execution.markov.MarkovChainStreamProcessor.TRAINING_OPTION)));
        trainingOptionExpressionExecutor = ((org.wso2.siddhi.core.executor.ExpressionExecutor) (map.get(org.wso2.extension.siddhi.execution.markov.MarkovChainStreamProcessor.TRAINING_OPTION_EXPRESSION_EXECUTOR)));
        lastScheduledTime = ((java.lang.Long) (map.get(org.wso2.extension.siddhi.execution.markov.MarkovChainStreamProcessor.LAST_SCHEDULED_TIME)));
    }
}