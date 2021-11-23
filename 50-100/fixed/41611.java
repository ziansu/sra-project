private com.jarektoro.responsivelayout.ResponsiveColumn.Visibility getVisibilityRuleForDisplaySize(com.jarektoro.responsivelayout.ResponsiveColumn.DisplaySize displaySize) {
    final com.jarektoro.responsivelayout.ResponsiveColumn.Visibility[] foundRule = new com.jarektoro.responsivelayout.ResponsiveColumn.Visibility[]{ null };
    for (com.jarektoro.responsivelayout.ResponsiveColumn.Visibility rule : visibilityRules) {
        if (rule.displaySize.equals(displaySize)) {
            foundRule[0] = rule;
        }
    }
    return foundRule[0];
}