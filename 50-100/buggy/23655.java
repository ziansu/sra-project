@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> currentState() {
    java.util.Map<java.lang.String, java.lang.Object> state = new java.util.HashMap<>(4);
    state.put(org.wso2.extension.siddhi.execution.markov.MarkovChainStreamProcessor.PROBABILITIES_CALCULATOR, markovChainTransitionProbabilitiesCalculator);
    state.put(org.wso2.extension.siddhi.execution.markov.MarkovChainStreamProcessor.TRAINING_OPTION, trainingOption);
    state.put(org.wso2.extension.siddhi.execution.markov.MarkovChainStreamProcessor.TRAINING_OPTION_EXPRESSION_EXECUTOR, trainingOptionExpressionExecutor);
    state.put(org.wso2.extension.siddhi.execution.markov.MarkovChainStreamProcessor.LAST_SCHEDULED_TIME, lastScheduledTime);
    return state;
}