public java.lang.String getGeneratedRule() {
    java.lang.String ruleString = getTemplate("src/ruletemplate.txt");
    ruleString = ruleString.replaceAll("%errormessage%", errorMessage);
    ruleString = ruleString.replaceAll("%triggerevents%", getTriggerLine());
    ruleString = ruleString.replaceAll("%declarations%", getDeclarationsLine());
    ruleString = ruleString.replaceAll("%selectstatements%", getSelectLine());
    ruleString = ruleString.replaceAll("%comparison%", getComparisonLine());
    return ruleString;
}