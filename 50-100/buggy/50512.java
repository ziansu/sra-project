@java.lang.Override
public java.util.List<java.lang.String> getParameters() {
    java.util.List<java.lang.String> parameters = test.getParameters();
    parameters.addAll(score.getParameters());
    parameters.add("faithfulnessAssumed");
    parameters.add("maxDegree");
    parameters.add("printStream");
    parameters.add("maxPathLength");
    parameters.add("completeRuleSetUsed");
    return parameters;
}