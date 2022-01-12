public java.util.ArrayList<RuleItem> pruneInfrequentRules(java.util.ArrayList<RuleItem> generatedRules) {
    int minSup = 0.2;
    int minConf = 0.3;
    for (RuleItem rule : generatedRules) {
        if (((rule.getSupport()) < minSup) || ((rule.getConfidence()) < minConf)) {
            generatedRules.remove(rule);
        }
    }
}