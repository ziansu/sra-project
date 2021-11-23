public java.util.ArrayList<RuleItem> pruneInfrequentRules(java.util.ArrayList<RuleItem> generatedRules) {
    double minSup = 0.2;
    double minConf = 0.3;
    for (RuleItem rule : generatedRules) {
        if (((rule.getSupport()) < minSup) || ((rule.getConfidence()) < minConf)) {
            generatedRules.remove(rule);
        }
    }
    return generatedRules;
}