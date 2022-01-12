private void addModifiedCondition(visitors.Expression expression) {
    if (null == expression)
        return ;
    
    java.lang.String s = expression.toString();
    int count = 0;
    for (java.lang.String str : SymbolAnalyzer.compare) {
        count += ((s.length()) - (s.replace(str, "").length())) / (str.length());
    }
    if (count == 0)
        (modifiedConditionCount)++;
    else
        modifiedConditionCount += count + 1;
    
}